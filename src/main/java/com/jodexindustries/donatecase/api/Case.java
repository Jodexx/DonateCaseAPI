package com.jodexindustries.donatecase.api;

import com.jodexindustries.donatecase.tools.CustomConfig;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * A class that represents all the main API methods
 */

public class Case {
    /**
     * List of entities currently in use
     */
    public static List<ArmorStand> listAR = new ArrayList<>();
    /**
     * Active cases
     */
    public static HashMap<Location, String> ActiveCase = new HashMap<>();


    /**
     * Players, who opened cases (open gui)
     */
    public static HashMap<UUID, OpenCase> playerOpensCase = new HashMap<>();

    /**
     * History data massive, key - case name
     */
    public static HashMap<String, HistoryData[]> historyData = new HashMap<>();

    /**
     * Save case location
     * @param name Case name (custom)
     * @param type Case type (config)
     * @param lv Case location
     */
    public static void saveLocation(String name, String type, Location lv) {}

    /**
     * Set case keys to a specific player
     * @param caseName Case name
     * @param player Player name
     * @param keys Number of keys
     */
    public static void setKeys(String caseName, String player, int keys) {}

    /**
     * Set null case keys to a specific player
     * @param caseName Case name
     * @param player Player name
     */
    public static void setNullKeys(String caseName, String player) {}

    /**
     * Add case keys to a specific player
     * @param caseName Case name
     * @param player Player name
     * @param keys Number of keys
     */
    public static void addKeys(String caseName, String player, int keys) {}

    /**
     * Delete case keys for a specific player
     * @param caseName Case name
     * @param player Player name
     * @param keys Number of keys
     */
    public static void removeKeys(String caseName, String player, int keys) {}

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
     * Delete case by location in Cases.yml
     * @param loc Case location
     */
    public static void deleteCaseByLocation(Location loc) {}

    /**
     * Delete case by name in Cases.yml
     * @param name Case name
     */
    public static void deleteCaseByName(String name) {}

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
    public static Map<String, YamlConfiguration> getCases() {
        return getCases();
    }

    /**
     * Start animation at a specific location
     * @param player The player who opened the case
     * @param location Location where to start the animation
     * @param caseName Case name
     */

    public static void startAnimation(Player player, Location location, String caseName) {}


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
     * Get win group Rgb (String massive)
     * @param c Case name
     * @param winGroup Group name
     * @return rgb massive with 3 items
     */
    public static String[] getWinGroupRgb(String c, String winGroup) {
        return getWinGroupRgb(c, winGroup);
    }

    /**
     * Get plugin instance
     * @return DonateCase instance
     */
    public static JavaPlugin getInstance() {
        return getInstance();
    }

    /**
     * Animation end method for custom animations is called to completely end the animation
     * @param winGroup Win group
     * @param c Case type
     * @param animation Animation name
     * @param player Player who opened
     * @param location Case location
     */

    public static void animationEnd(String c, String animation, Player player, Location location, String winGroup) {}


    /**
     * Case open finish method for custom animations is called to grant a group, send a message, and more
     * @param caseName Case name
     * @param player Player who opened
     * @param needSound Boolean sound
     * @param winGroup Win group
     */
    public static void onCaseOpenFinish(String caseName, Player player, boolean needSound, String winGroup) {}

    /**
     * Get case location (in Cases.yml) by block location
     * @param blockLocation Block location
     * @return case location in Cases.yml (with yaw and pitch)
     */
    public static Location getCaseLocationByBlockLocation(Location blockLocation) {
        return getCaseLocationByBlockLocation(blockLocation);
    }

    /** Get plugin configuration manager
     * @return configuration manager instance
     */
    public static @NotNull CustomConfig getCustomConfig() {
        return getCustomConfig();
    }

    /**
     * Get case title
     * @param caseName Case name
     * @return case title
     */
    public static String getCaseTitle(String caseName) {
        return getCaseTitle(caseName);
    }
}