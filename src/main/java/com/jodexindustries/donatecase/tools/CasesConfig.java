package com.jodexindustries.donatecase.tools;

import org.bukkit.configuration.file.YamlConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * Class representing all cases configurations
 */
public class CasesConfig {
    /**
     * Map of cases
     */
    public Map<String, YamlConfiguration> cases = new HashMap<>();

    /**
     * Get map of cases
     * @return map of cases
     */
    public Map<String, YamlConfiguration> getCases() {
        return cases;
    }

    /**
     * Get case configuration
     * @param name Case name
     * @return Case configuration
     */
     public YamlConfiguration getCase(String name) {
        return cases.get(name);
     }
}
