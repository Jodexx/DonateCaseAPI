package com.jodexindustries.donatecase.api;

import com.jodexindustries.donatecase.dc.Main;
import com.jodexindustries.donatecase.tools.Tools;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.jodexindustries.donatecase.dc.Main.customConfig;

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

    public static String getRandomGroup(String c) {
        return getRandomGroup(c);
    }

    public static String getWinGroupId(String c, String winGroup) {
        return getWinGroupId(c, winGroup);
    }
    public static String getWinGroupDisplayName(String c, String winGroup) {return getWinGroupDisplayName(c, winGroup);}

    public static void onCaseOpenFinish(String casename, Player player, boolean needsound, String winGroup) {}

    /**
     * @param blockLocation Location
     * @return
     */
    public static @NotNull Location getCaseLocationByBlockLocation(Location blockLocation) {
        return getCaseLocationByBlockLocation(blockLocation);
    }
}