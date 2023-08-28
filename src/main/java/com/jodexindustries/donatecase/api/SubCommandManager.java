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

    public static void registerSubCommand(String commandName, SubCommand subCommand) {
        registerSubCommand(commandName, subCommand);
    }

    public static Map<String, SubCommand> getSubCommands() {
        return subCommands;
    }
    public static List<String> getTabCompletionsForSubCommand(CommandSender sender, String subCommandName, String[] args) {
        SubCommand subCommand = subCommands.get(subCommandName.toLowerCase());
        if (subCommand != null) {
            return subCommand.getTabCompletions(sender, args);
        }
        return null;
    }
}
