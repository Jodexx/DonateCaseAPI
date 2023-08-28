package com.jodexindustries.donatecase.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when the animation ends
 */
public class AnimationEndEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    String caseType;
    Location location;
    String animation;

    public AnimationEndEvent(@NotNull Player who, String animation, String caseType, Location location) {
        super(who);
        this.caseType = caseType;
        this.location = location;
        this.animation = animation;
    }

    @NotNull
    public Location getLocation() {
        return location;
    }
    /**
     * Get case type (type from config)
     * @return case type
     */
    @NotNull
    public String getCaseType() {
        return caseType;
    }
    public String getAnimation() {
        return animation;
    }


    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
