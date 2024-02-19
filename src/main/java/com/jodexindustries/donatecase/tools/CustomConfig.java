package com.jodexindustries.donatecase.tools;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.IOException;
import java.util.logging.Level;

/**
 * Class representing all plugin configurations
 */

public class CustomConfig {

    /**
     * Constructor to get class methods
     */

    public CustomConfig() {}


    /**
     * Reload all configs
     */

    public void reload(){}

    /**
     * Save Cases.yml
     */

    public void saveCases() {}

    /**
     * Save Keys.yml
     */

    public void saveKeys() {}


    /**
     * Save Config.yml
     */
    public void saveConfig() {}

    /**
     * Get Cases.yml
     * @return Cases.yml
     */

    public YamlConfiguration getCases() {
        return getCases();
    }

    /**
     * Get Keys.yml
     * @return Keys.yml
     */
    public YamlConfiguration getKeys() {
        return getKeys();
    }

    /**
     * Get Config.yml
     * @return Config.yml
     */

    public YamlConfiguration getConfig() {
        return getConfig();
    }

    /**
     * Get Animations.yml
     * @return Animations.yml
     */

    public YamlConfiguration getAnimations() {
        return getAnimations();
    }

    /**
     * Get Data.yml
     * @return Data.yml
     */
    public YamlConfiguration getData() {
        return getData();
    }

    /**
     * Get Language file (lang/file.yml)
     * @return language
     */
    public YamlConfiguration getLang() {
        return getLang();
    }
}
