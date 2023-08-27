package com.jodexindustries.donatecase.api;

import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * Interface for registering sub commands
 */

public interface SubCommand {
    /**
     * Executes the given sub command
     * @param sender Source of the command
     * @param args Passed command arguments
     */
    void execute(CommandSender sender, String[] args);

    /**
     * Tab completions
     * @param sender Source of the command
     * @param args Passed command arguments
     * @return Tab completions
     */
    List<String> getTabCompletions(CommandSender sender, String[] args);
    /**
     * Command type (ADMIN, MODER, PLAYER)
     * @return SubCommandType
     */
    SubCommandType getType();
}
