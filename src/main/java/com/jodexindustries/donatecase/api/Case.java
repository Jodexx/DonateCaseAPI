package com.jodexindustries.donatecase.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Case {
    /**
     * Set case keys to a specific player
     * @param casename Case name
     * @param player Player name
     * @param keys Number of keys
     */
    public static void setKeys(String casename, String player, int keys) {}

    /**
     * Add case keys to a specific player
     * @param casename Case name
     * @param player Player name
     * @param keys Number of keys
     */
    public static void addKeys(String casename, String player, int keys) {}

    /**
     * Delete case keys for a specific player
     * @param casename Case name
     * @param player Player name
     * @param keys Number of keys
     */
    public static void removeKeys(String casename, String player, int keys) {}

    /**
     * Get the keys to a certain player's case
     * @param name Case name
     * @param player Player name
     * @return Number of keys
     */
    public static int getKeys(String name, String player) {
        return getKeys(name, player);
    }

    /**
     * Is there a case on these coordinates?
     * @param loc <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Location.html#toString()">Location#toString()</a>
     * @return true/false
     */
    public static boolean hasCaseByLocation(Location loc) {
        return hasCaseByLocation(loc);
    }

    /**
     * Get case type by location
     * @param loc
     * @return Case type
     */
    public static String getCaseTypeByLocation(Location loc) {
        return getCaseTypeByLocation(loc);
    }

    /**
     * Get case name by location
     * @param loc
     * @return Case name
     */
    public static String getCaseNameByLocation(Location loc) {
        return getCaseNameByLocation(loc);
    }

    /**
     * Is there a case with a name?
     * @param name Case name
     * @return true/false
     */
    public static boolean hasCaseByName(String name) {
        return hasCaseByName(name);
    }
    /**
     * Are there cases that have been created?
     * @param name Case name
     * @return true/false
     */
    public static boolean hasCaseDataByName(String name) {
        return hasCaseDataByName(name);
    }

    /**
     * Are there cases with a specific title?
     * @param title Case title
     * @return true/false
     */
    public static boolean hasCaseByTitle(String title) {
        return hasCaseByTitle(title);
    }

    /**
     * Get a case name with a title
     * @param title Case title
     * @return Case name
     */
    public static String getCaseByTitle(String title) {
        return getCaseByTitle(title);
    }

    /**
     * Start animation at a specific location
     * @param player The player who opened the case
     * @param location Location where to start the animation
     * @param casename Case name
     */

    public static void startAnimation(Player player, Location location, String casename) {}

    /**
     * @param blockLocation Location
     * @return
     */
    public static @NotNull Location getCaseLocationByBlockLocation(Location blockLocation) {
        return getCaseLocationByBlockLocation(blockLocation);
    }
}