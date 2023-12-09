package com.jodexindustries.donatecase.api;

/**
 * Class to implement information about case opening histories
 */
public class HistoryData {
    private final String playerName;
    private final long time;
    private final String group;

    public HistoryData(String playerName, long time, String group) {
        this.playerName = playerName;
        this.time = time;
        this.group = group;
    }

    /**
     * Get player name, who opened case
     * @return player name
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Get timestamp, when case successful opened
     * @return timestamp
     */

    public long getTime() {
        return time;
    }

    /**
     * Get win group
     * @return win group
     */
    public String getGroup() {
        return group;
    }
}
