package com.jodexindustries.donatecase.api.armorstand;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class PacketArmorStandCreator implements ArmorStandCreator {
    private int entityId;
    private Location location;

    public void spawnArmorStand(Location location) {}
    public void setHelmet(ItemStack item) {}

    public void setVisible(boolean isVisible) {}



    public void setCustomName(String displayName) {}
    public void setGravity(boolean isGravity) {}

    @Override
    public void setSmall(boolean small) {}

    @Override
    public Location getLocation() {
        return location;
    }

    public void teleport(Location location) {}

    public void remove() {}
}
