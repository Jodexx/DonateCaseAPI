package com.jodexindustries.donatecase.api;

public class Case {
    /**
     * Set case keys to a specific player
     * @param casename case name
     * @param player player name
     * @param keys number of keys
     */
    public static void setKeys(String casename, String player, int keys) {}

    /**
     * Add case keys to a specific player
     * @param casename case name
     * @param player player name
     * @param keys number of keys
     */
    public static void addKeys(String casename, String player, int keys) {}

    /**
     * Delete case keys for a specific player
     * @param casename case name
     * @param player player name
     * @param keys number of keys
     */
    public static void removeKeys(String casename, String player, int keys) {}

    /**
     * Get the keys to a certain player's case
     * @param name case name
     * @param player player name
     * @return number of keys
     */
    public static int getKeys(String name, String player) {
        return getKeys(name, player);
    }

    /**
     * Is there a case on these coordinates?
     * @param loc <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Location.html#toString()">Location#toString()</a>
     * @return true/false
     */
    public static boolean hasCaseByLocation(String loc) {
        return hasCaseByLocation(loc);
    }

    /**
     * Get case type by location
     * @param loc <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Location.html#toString()">Location#toString()</a>
     * @return case type
     */
    public static String getCaseTypeByLocation(String loc) {
        return getCaseTypeByLocation(loc);
    }

    /**
     * Get case name by location
     * @param loc <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Location.html#toString()">Location#toString()</a>
     * @return case name
     */
    public static String getCaseNameByLocation(String loc) {
        return getCaseNameByLocation(loc);
    }

    /**
     * Is there a case with a name?
     * @param name case name
     * @return true/false
     */
    public static boolean hasCaseByName(String name) {
        return hasCaseByName(name);
    }
    /**
     * Are there cases that have been created?
     * @param name case name
     * @return true/false
     */
    public static boolean hasCaseDataByName(String name) {
        return hasCaseDataByName(name);
    }

    /**
     * Are there cases with a specific title?
     * @param title case title
     * @return true/false
     */
    public static boolean hasCaseByTitle(String title) {
        return hasCaseByTitle(title);
    }

    /**
     * Get a case name with a title
     * @param title case title
     * @return case name
     */
    public static String getCaseByTitle(String title) {
        return getCaseByTitle(title);
    }
}