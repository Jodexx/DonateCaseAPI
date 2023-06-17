package com.jodexindustries.donatecase.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class AnimationManager {
    private static Map<String, Class<? extends Animation>> registeredAnimations = new HashMap<>();
    public static void registerAnimation(String name, Class<? extends Animation> animation) {}
    public static void playAnimation(String name, Player player, Location location, String c) {}
    public static boolean isRegistered(String name) {
        return registeredAnimations.get(name) != null;
    }
    public static Map<String, Class<? extends Animation>> getRegisteredAnimations() {
        return registeredAnimations;
    }
}
