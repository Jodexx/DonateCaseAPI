package com.jodexindustries.donatecase.api;

import com.jodexindustries.donatecase.tools.CustomConfig;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A class that represents all the main API methods
 */

public class Case {
    /**
     * List of entities currently in use
     */
    public static List<ArmorStand> listAR = new ArrayList<>();
    /**
     * Open cases (active)
     */
    public static HashMap<Player, Location> openCase = new HashMap<>();
    /**
     * Active cases
     */
    public static HashMap<Location, String> ActiveCase = new HashMap<>();

    /**
     * Players, who opened cases (started scrolling)
     */
    public static List<Player> caseOpen = new ArrayList<>();


    /**
     * Save case location
     * @param name Case name (custom)
     * @param type Case type (config)
     * @param lv Case location
     */
    public static void saveLocation(String name, String type, Location lv) {}

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
     * @param loc Case location
     * @return true/false
     */
    public static boolean hasCaseByLocation(Location loc) {
        return hasCaseByLocation(loc);
    }

    /**
     * Get case type by location
     * @param loc Case location
     * @return Case type
     */
    public static String getCaseTypeByLocation(Location loc) {
        return getCaseTypeByLocation(loc);
    }

    /**
     * Get case name by location
     * @param loc Case location
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
     * Get all cases in config
     * @return cases
     */
    public static @NotNull List<String> getCases() {
        return getCases();
    }

    /**
     * Get a case name with a title
     * @param title Case title
     * @return Case name
     */
    @Deprecated
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
     * Get random group from case
     * @param c Case name
     * @return Group name (item name)
     */
    public static String getRandomGroup(String c) {
        return getRandomGroup(c);
    }

    /**
     * Get win group id (item id)
     * @param c Case name
     * @param winGroup Group name
     * @return Group id
     */

    public static String getWinGroupId(String c, String winGroup) {
        return getWinGroupId(c, winGroup);
    }

    /**
     * Get win group displayname
     * @param c Case name
     * @param winGroup Group name
     * @return Group displayname
     */
    public static String getWinGroupDisplayName(String c, String winGroup) {return getWinGroupDisplayName(c, winGroup);}

    /**
     * Get win group enchant (boolean)
     * @param c Case name
     * @param winGroup Group name
     * @return true/false
     */
    public static boolean getWinGroupEnchant(String c, String winGroup) {
        return getWinGroupEnchant(c, winGroup);
    }

    /**
     * Get plugin instance
     * @return DonateCase instance
     */
    public static JavaPlugin getInstance() {
        return getInstance();
    }

    /**
     * Animation end method for custom animations
     * @param winGroup Win group
     * @param c Case type
     * @param animation Animation name
     * @param player Player who opened
     * @param location Case location
     */

    public static void animationEnd(String c, String animation, Player player, Location location, String winGroup) {}


    /**
     * Case open finish method for custom animations
     * @param casename Case name
     * @param player Player who opened
     * @param needsound Boolean sound
     * @param winGroup Win group
     */
    public static void onCaseOpenFinish(String casename, Player player, boolean needsound, String winGroup) {}

    /** Get case location by block location
     * @param blockLocation Location
     * @return case location (with yaw and pitch)
     */
    public static @NotNull Location getCaseLocationByBlockLocation(Location blockLocation) {
        return getCaseLocationByBlockLocation(blockLocation);
    }

    /** Get plugin configuration manager
     * @return configuration manager instance
     */
    public static @NotNull CustomConfig getCustomConfig() {
        return getCustomConfig();
    }
}