package com.intime.data;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class TimeTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private final UUID transactionId;
    private final UUID fromUUID;
    private final UUID toUUID;
    private final int amount;
    private final String type;
    private final String reason;
    private final Instant timestamp;
    
    public TimeTransaction(UUID fromUUID, UUID toUUID, int amount, String type, String reason, Instant timestamp) {
        this.transactionId = UUID.randomUUID();
        this.fromUUID = fromUUID;
        this.toUUID = toUUID;
        this.amount = amount;
        this.type = type;
        this.reason = reason;
        this.timestamp = timestamp;
    }
    
    // Getters
    public UUID getTransactionId() {
        return transactionId;
    }
    
    public UUID getFromUUID() {
        return fromUUID;
    }
    
    public UUID getToUUID() {
        return toUUID;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public String getType() {
        return type;
    }
    
    public String getReason() {
        return reason;
    }
    
    public Instant getTimestamp() {
        return timestamp;
    }
    
    public boolean isPositive() {
        return amount > 0;
    }
    
    public boolean isNegative() {
        return amount < 0;
    }
    
    public String getFormattedAmount() {
        int absAmount = Math.abs(amount);
        int hours = absAmount / 3600;
        int minutes = (absAmount % 3600) / 60;
        int seconds = absAmount % 60;
        
        if (hours > 0) {
            return String.format("%s%d:%02d:%02d", amount >= 0 ? "+" : "-", hours, minutes, seconds);
        } else if (minutes > 0) {
            return String.format("%s%d:%02d", amount >= 0 ? "+" : "-", minutes, seconds);
        } else {
            return String.format("%s%d seconds", amount >= 0 ? "+" : "-", seconds);
        }
    }
    
    public String getFormattedTimestamp() {
        return timestamp.toString();
    }
    
    public long getAgeInSeconds() {
        return Instant.now().getEpochSecond() - timestamp.getEpochSecond();
    }
    
    public String getAgeDescription() {
        long ageSeconds = getAgeInSeconds();
        
        if (ageSeconds < 60) {
            return ageSeconds + " seconds ago";
        } else if (ageSeconds < 3600) {
            return (ageSeconds / 60) + " minutes ago";
        } else if (ageSeconds < 86400) {
            return (ageSeconds / 3600) + " hours ago";
        } else {
            return (ageSeconds / 86400) + " days ago";
        }
    }
    
    @Override
    public String toString() {
        return String.format("TimeTransaction{id=%s, from=%s, to=%s, amount=%d, type=%s, reason='%s', timestamp=%s}",
            transactionId, fromUUID, toUUID, amount, type, reason, timestamp);
    }
}
