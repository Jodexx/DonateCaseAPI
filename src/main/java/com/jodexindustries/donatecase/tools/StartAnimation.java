package com.jodexindustries.donatecase.tools;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class StartAnimation {


    /**
     * Players, who opened cases (started scrolling)
     */
    public static List<Player> caseOpen = new ArrayList<>();

    public StartAnimation(@NotNull final Player player, @NotNull final Location location, @NotNull final String c) {}
}
