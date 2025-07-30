package com.example.greekmyth.roles;

public class Role {
    public final String name;
    public final String prefix;
    public final String color;
    public final int permissionLevel;

    public Role(String name, String prefix, String color, int permissionLevel) {
        this.name = name;
        this.prefix = prefix;
        this.color = color;
        this.permissionLevel = permissionLevel;
    }
} 