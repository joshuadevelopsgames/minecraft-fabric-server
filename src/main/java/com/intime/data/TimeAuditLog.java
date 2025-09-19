package com.intime.data;

import com.intime.InTimeMod;
import java.io.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class TimeAuditLog {
    private static final String AUDIT_LOG_DIR = "intime_audit";
    private static final Map<UUID, List<TimeTransaction>> playerTransactions = new ConcurrentHashMap<>();
    private static final List<TimeTransaction> globalTransactions = new ArrayList<>();
    
    /**
     * Add a transaction to the audit log
     */
    public static void logTransaction(TimeTransaction transaction) {
        // Add to global transactions
        synchronized (globalTransactions) {
            globalTransactions.add(transaction);
        }
        
        // Add to player-specific transactions
        if (transaction.getFromUUID() != null) {
            playerTransactions.computeIfAbsent(transaction.getFromUUID(), k -> new ArrayList<>())
                .add(transaction);
        }
        
        if (transaction.getToUUID() != null) {
            playerTransactions.computeIfAbsent(transaction.getToUUID(), k -> new ArrayList<>())
                .add(transaction);
        }
        
        // Save to disk
        saveTransaction(transaction);
        
        // Log to console
        InTimeMod.LOGGER.info("Time transaction logged: {} {} -> {} {}s ({})", 
            transaction.getType(), 
            transaction.getFromUUID(), 
            transaction.getToUUID(), 
            transaction.getAmount(), 
            transaction.getReason());
    }
    
    /**
     * Get transactions for a specific player within a time range
     */
    public static List<TimeTransaction> getPlayerTransactions(UUID playerUUID, int hoursBack) {
        Instant cutoff = Instant.now().minus(hoursBack, ChronoUnit.HOURS);
        
        return playerTransactions.getOrDefault(playerUUID, new ArrayList<>())
            .stream()
            .filter(tx -> tx.getTimestamp().isAfter(cutoff))
            .sorted(Comparator.comparing(TimeTransaction::getTimestamp).reversed())
            .collect(Collectors.toList());
    }
    
    /**
     * Get all transactions within a time range
     */
    public static List<TimeTransaction> getGlobalTransactions(int hoursBack) {
        Instant cutoff = Instant.now().minus(hoursBack, ChronoUnit.HOURS);
        
        synchronized (globalTransactions) {
            return globalTransactions.stream()
                .filter(tx -> tx.getTimestamp().isAfter(cutoff))
                .sorted(Comparator.comparing(TimeTransaction::getTimestamp).reversed())
                .collect(Collectors.toList());
        }
    }
    
    /**
     * Get top players by time balance (estimated from transactions)
     */
    public static Map<UUID, Integer> getTopPlayers(int count) {
        Map<UUID, Integer> playerBalances = new HashMap<>();
        
        // Calculate balances from transactions
        for (List<TimeTransaction> transactions : playerTransactions.values()) {
            for (TimeTransaction tx : transactions) {
                if (tx.getToUUID() != null) {
                    playerBalances.merge(tx.getToUUID(), tx.getAmount(), Integer::sum);
                }
                if (tx.getFromUUID() != null) {
                    playerBalances.merge(tx.getFromUUID(), -tx.getAmount(), Integer::sum);
                }
            }
        }
        
        // Sort by balance and return top N
        return playerBalances.entrySet().stream()
            .sorted(Map.Entry.<UUID, Integer>comparingByValue().reversed())
            .limit(count)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
    }
    
    /**
     * Save a transaction to disk
     */
    private static void saveTransaction(TimeTransaction transaction) {
        try {
            File auditDir = new File(AUDIT_LOG_DIR);
            if (!auditDir.exists()) {
                auditDir.mkdirs();
            }
            
            // Save to daily log file
            String dateStr = transaction.getTimestamp().toString().substring(0, 10);
            File logFile = new File(auditDir, "transactions_" + dateStr + ".log");
            
            try (PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
                writer.println(String.format("%s|%s|%s|%s|%d|%s|%s|%s",
                    transaction.getTransactionId(),
                    transaction.getFromUUID(),
                    transaction.getToUUID(),
                    transaction.getType(),
                    transaction.getAmount(),
                    transaction.getReason(),
                    transaction.getTimestamp(),
                    transaction.getFormattedAmount()
                ));
            }
            
        } catch (IOException e) {
            InTimeMod.LOGGER.error("Failed to save transaction to audit log", e);
        }
    }
    
    /**
     * Load transactions from disk on server startup
     */
    public static void loadTransactions() {
        File auditDir = new File(AUDIT_LOG_DIR);
        if (!auditDir.exists()) {
            return;
        }
        
        File[] logFiles = auditDir.listFiles((dir, name) -> name.startsWith("transactions_") && name.endsWith(".log"));
        if (logFiles == null) {
            return;
        }
        
        for (File logFile : logFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    try {
                        TimeTransaction transaction = parseTransactionLine(line);
                        if (transaction != null) {
                            // Add to in-memory storage
                            if (transaction.getFromUUID() != null) {
                                playerTransactions.computeIfAbsent(transaction.getFromUUID(), k -> new ArrayList<>())
                                    .add(transaction);
                            }
                            if (transaction.getToUUID() != null) {
                                playerTransactions.computeIfAbsent(transaction.getToUUID(), k -> new ArrayList<>())
                                    .add(transaction);
                            }
                            globalTransactions.add(transaction);
                        }
                    } catch (Exception e) {
                        InTimeMod.LOGGER.warn("Failed to parse transaction line: " + line, e);
                    }
                }
            } catch (IOException e) {
                InTimeMod.LOGGER.error("Failed to load transactions from " + logFile.getName(), e);
            }
        }
        
        InTimeMod.LOGGER.info("Loaded {} transactions from audit log", globalTransactions.size());
    }
    
    /**
     * Parse a transaction line from the log file
     */
    private static TimeTransaction parseTransactionLine(String line) {
        try {
            String[] parts = line.split("\\|");
            if (parts.length >= 7) {
                UUID fromUUID = parts[1].equals("null") ? null : UUID.fromString(parts[1]);
                UUID toUUID = parts[2].equals("null") ? null : UUID.fromString(parts[2]);
                String type = parts[3];
                int amount = Integer.parseInt(parts[4]);
                String reason = parts[5];
                Instant timestamp = Instant.parse(parts[6]);
                
                return new TimeTransaction(fromUUID, toUUID, amount, type, reason, timestamp);
            }
        } catch (Exception e) {
            InTimeMod.LOGGER.warn("Failed to parse transaction line: " + line, e);
        }
        return null;
    }
    
    /**
     * Clean up old transactions from memory
     */
    public static void cleanupOldTransactions(int daysToKeep) {
        Instant cutoff = Instant.now().minus(daysToKeep, ChronoUnit.DAYS);
        
        // Clean global transactions
        synchronized (globalTransactions) {
            globalTransactions.removeIf(tx -> tx.getTimestamp().isBefore(cutoff));
        }
        
        // Clean player transactions
        for (List<TimeTransaction> transactions : playerTransactions.values()) {
            transactions.removeIf(tx -> tx.getTimestamp().isBefore(cutoff));
        }
        
        // Remove empty player entries
        playerTransactions.entrySet().removeIf(entry -> entry.getValue().isEmpty());
    }
    
    /**
     * Get transaction statistics
     */
    public static Map<String, Object> getStatistics() {
        Map<String, Object> stats = new HashMap<>();
        
        synchronized (globalTransactions) {
            stats.put("totalTransactions", globalTransactions.size());
            stats.put("uniquePlayers", playerTransactions.size());
            
            if (!globalTransactions.isEmpty()) {
                stats.put("oldestTransaction", globalTransactions.stream()
                    .min(Comparator.comparing(TimeTransaction::getTimestamp))
                    .map(TimeTransaction::getTimestamp));
                
                stats.put("newestTransaction", globalTransactions.stream()
                    .max(Comparator.comparing(TimeTransaction::getTimestamp))
                    .map(TimeTransaction::getTimestamp));
            }
        }
        
        return stats;
    }
}
