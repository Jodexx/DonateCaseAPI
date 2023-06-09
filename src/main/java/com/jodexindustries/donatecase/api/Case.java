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
}