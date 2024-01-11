package com.jodexindustries.donatecase.api;

import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Sub command class manager
 */
public class SubCommandManager {
    public static final Map<String, SubCommand> subCommands = new HashMap<>();

    /**
     * Register sub command
     * @param commandName Sub command name to register
     * @param subCommand Class that implements the SubCommand interface
     */
    public static void registerSubCommand(String commandName, SubCommand subCommand) {}

    /**
     * Unregister sub command
     * @param commandName Sub command name to unregister
     */
    public static void unregisterSubCommand(String commandName) {}

    /**
     * Get all subcommands
     * @return String - sub command name <br> SubCommand - Class that implements the SubCommand interface
     */
    public static Map<String, SubCommand> getSubCommands() {
        return subCommands;
    }

    /**
     * Get tab completions for a subcommand
     * @param sender Source of the command
     * @param args Passed command arguments
     * @param subCommandName Sub command name
     * @return Tab completions
     */
    public static List<String> getTabCompletionsForSubCommand(CommandSender sender, String subCommandName, String[] args) {
        SubCommand subCommand = subCommands.get(subCommandName.toLowerCase());
        if (subCommand != null) {
            return subCommand.getTabCompletions(sender, args);
        }
        return null;
    }
}
