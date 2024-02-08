package com.jodexindustries.donatecase.api;

import com.jodexindustries.donatecase.api.data.Animation;
import com.jodexindustries.donatecase.api.data.CaseData;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AnimationManager {
    private static final Map<String, Class<? extends Animation>> registeredAnimations = new HashMap<>();

    /**
     * Register custom animation
     * @param name Animation name
     * @param animation Animation class
     */
    public static void registerAnimation(String name, Class<? extends Animation> animation) {}

    /**
     * Unregister custom animation
     * @param name Animation name
     */
    public static void unregisterAnimation(String name) {}
    /**
     * Play animation
     * @param name Animation name
     * @param player Player who opened case (for who animation played)
     * @param location Case location (with pitch and yaw player)
     * @param c Case data
     */
    public static void playAnimation(String name, Player player, Location location, CaseData c) {}
    public static boolean isRegistered(String name) {
        return registeredAnimations.get(name) != null;
    }

    /**
     * Get all registered animations
     * @return map with registered animations
     */
    public static Map<String, Class<? extends Animation>> getRegisteredAnimations() {
        return registeredAnimations;
    }

    /**
     * Get registered animation
     * @param animation Animation name
     * @return Animation class instance
     */
    private static Animation getRegisteredAnimation(String animation) {
        if (registeredAnimations.containsKey(animation)) {
            try {
                Class<? extends Animation> animationClass = getRegisteredAnimations().get(animation);
                return animationClass.getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
