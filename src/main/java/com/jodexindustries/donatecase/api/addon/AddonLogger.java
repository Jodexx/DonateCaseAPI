package com.jodexindustries.donatecase.api.addon;

import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class AddonLogger extends Logger {
    private final String addonName;

    /**
     * Creates a new AddonLogger that extracts the name from an addon
     *
     * @param context A reference to the addon
     */
    public AddonLogger(@NotNull Addon context) {
        super(context.getDonateCase().getName(), null);
        addonName = "[" + context.getName() + "] ";
        setParent(context.getDonateCase().getLogger());
        setLevel(Level.ALL);
    }

    @Override
    public void log(@NotNull LogRecord logRecord) {
        logRecord.setMessage(addonName + logRecord.getMessage());
        super.log(logRecord);
    }

}