// NOTE: Add implementation 'com.google.code.gson:gson:2.10.1' to your build.gradle dependencies if not present.
package com.example.greekmyth.roles;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.minecraft.server.network.ServerPlayerEntity;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RolesManager {
    private static final String CONFIG_PATH = "config/custom_roles.json";
    private static final Gson GSON = new Gson();
    private static Map<String, Role> roles = new HashMap<>();
    private static Map<String, String> assignments = new HashMap<>();

    public static void loadConfig() {
        try (FileReader reader = new FileReader(new File(CONFIG_PATH))) {
            Type type = new TypeToken<Map<String, Object>>(){}.getType();
            Map<String, Object> data = GSON.fromJson(reader, type);
            roles.clear();
            assignments.clear();
            if (data.containsKey("roles")) {
                Map<String, Object> rolesObj = (Map<String, Object>) data.get("roles");
                for (Entry<String, Object> entry : rolesObj.entrySet()) {
                    String name = entry.getKey();
                    Map<String, Object> props = (Map<String, Object>) entry.getValue();
                    String prefix = (String) props.getOrDefault("prefix", "");
                    String color = (String) props.getOrDefault("color", "white");
                    int perm = ((Number)props.getOrDefault("permission_level", 0)).intValue();
                    roles.put(name, new Role(name, prefix, color, perm));
                }
            }
            if (data.containsKey("assignments")) {
                Map<String, Object> assignmentsObj = (Map<String, Object>) data.get("assignments");
                for (Entry<String, Object> entry : assignmentsObj.entrySet()) {
                    assignments.put(entry.getKey(), (String)entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveConfig() {
        try {
            Map<String, Object> data = new HashMap<>();
            
            // Convert roles to serializable format
            Map<String, Object> rolesObj = new HashMap<>();
            for (Map.Entry<String, Role> entry : roles.entrySet()) {
                Role role = entry.getValue();
                Map<String, Object> roleData = new HashMap<>();
                roleData.put("prefix", role.prefix);
                roleData.put("color", role.color);
                roleData.put("permission_level", role.permissionLevel);
                rolesObj.put(role.name, roleData);
            }
            data.put("roles", rolesObj);
            
            // Add assignments
            data.put("assignments", assignments);
            
            // Write to file
            try (FileWriter writer = new FileWriter(new File(CONFIG_PATH))) {
                GSON.toJson(data, writer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Role getRoleForPlayer(ServerPlayerEntity player) {
        String name = player.getName().getString();
        String roleName = assignments.getOrDefault(name, "Member");
        return roles.getOrDefault(roleName, new Role("Member", "[Member]", "green", 1));
    }

    public static void assignRole(String playerName, String roleName) {
        assignments.put(playerName, roleName);
        saveConfig(); // Save the assignment to persist it
    }

    public static void reload() {
        loadConfig();
    }
    
    public static void setRolePermission(String roleName, int permissionLevel) {
        Role role = roles.get(roleName);
        if (role != null) {
            // Create a new role with updated permission level
            Role updatedRole = new Role(role.name, role.prefix, role.color, permissionLevel);
            roles.put(roleName, updatedRole);
            saveConfig(); // Save the updated role to persist it
        }
    }
} 