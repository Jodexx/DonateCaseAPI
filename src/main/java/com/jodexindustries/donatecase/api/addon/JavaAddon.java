package com.jodexindustries.donatecase.api.addon;

import com.jodexindustries.donatecase.api.Case;
import org.bukkit.plugin.Plugin;

public abstract class JavaAddon implements Addon {
    private String version;
    private String name;

    public void init(String version, String name) {
        this.version = version;
        this.name = name;
    }
    public JavaAddon() {}


    @Override
    public void onDisable() {}

    @Override
    public void onEnable() {}

    @Override
    public Plugin getDonateCase() {
        return Case.getInstance();
    }
    @Override
    public String getVersion() {
        return version;
    }
    @Override
    public String getName() {
        return name;
    }
}