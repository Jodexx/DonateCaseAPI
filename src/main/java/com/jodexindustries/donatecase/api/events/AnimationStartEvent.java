package com.jodexindustries.donatecase.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;


/**
 * Called when the animation starts
 */
public class AnimationStartEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    String caseType;
    Location location;
    String animation;
    String winGroup;

    public AnimationStartEvent(@NotNull Player who, String animation, String caseType, Location location, String winGroup) {
        super(who);
        this.caseType = caseType;
        this.location = location;
        this.animation = animation;
        this.winGroup = winGroup;
    }

    /**
     * Get case location
     * @return case location
     */

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

    /**
     * Get case animation
     * @return case animation
     */
    @NotNull
    public String getAnimation() {
        return animation;
    }

    /**
     * Get the win group
     * @return win group
     */
    @NotNull
    public String getWinGroup() {
        return winGroup;
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
