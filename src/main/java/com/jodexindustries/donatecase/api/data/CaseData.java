package com.jodexindustries.donatecase.api.data;

import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class CaseData implements Cloneable {
    private final String caseName;
    private String caseDisplayName;
    private String caseTitle;
    private String animation;
    private AnimationSound animationSound;
    private Map<String, Item> items;
    private HistoryData[] historyData;
    private Hologram hologram;

    public CaseData(String caseName, String caseDisplayName, String caseTitle,
                    String animation, AnimationSound animationSound, Map<String,
            Item> items, HistoryData[] historyData, Hologram hologram) {
        this.caseName = caseName;
        this.caseDisplayName = caseDisplayName;
        this.caseTitle = caseTitle;
        this.animation = animation;
        this.animationSound = animationSound;
        this.items = items;
        this.historyData = historyData;
        this.hologram = hologram;
    }

    @Override
    public String toString() {
        return "CaseData{" +
                "caseName='" + caseName + '\'' +
                ", caseDisplayName='" + caseDisplayName + '\'' +
                ", caseTitle='" + caseTitle + '\'' +
                ", animation='" + animation + '\'' +
                ", animationSound=" + animationSound +
                ", items=" + items +
                ", historyData=" + Arrays.toString(historyData) +
                '}';
    }

    /**
     * Get case history data
     * @return history data
     */
    public HistoryData[] getHistoryData() {
        return historyData;
    }

    /**
     * Get case items
     * @return items
     */
    public Map<String, Item> getItems() {
        return items;
    }

    /**
     * Get case item
     * @param name item name
     * @return item
     */
    public Item getItem(String name) {
        return items.getOrDefault(name, null);
    }

    /**
     * Set case history data
     * @param historyData history data
     */
    public void setHistoryData(HistoryData[] historyData) {
        this.historyData = historyData;
    }

    /**
     * Set case items
     * @param items map of CaseData.Item items
     */
    public void setItems(Map<String, Item> items) {
        this.items = items;
    }

    /**
     * Get animation sound
     * @return CaseData.AnimationSound
     */
    public AnimationSound getAnimationSound() {
        return animationSound;
    }

    /**
     * Set animation sound
     * @param animationSound CaseData.AnimationSound
     */
    public void setAnimationSound(AnimationSound animationSound) {
        this.animationSound = animationSound;
    }

    /**
     * Get animation
     * @return animation
     */
    public String getAnimation() {
        return animation;
    }

    /**
     * Set animation
     * @param animation animation
     */
    public void setAnimation(String animation) {
        this.animation = animation;
    }

    /**
     * Get case title
     * @return title
     */
    public String getCaseTitle() {
        return caseTitle;
    }

    /**
     * Set case title
     * @param caseTitle title
     */
    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    /**
     * Get case name
     * @return case name
     */
    public String getCaseName() {
        return caseName;
    }

    @Override
    public CaseData clone() {
        try {
            CaseData clonedCaseData = (CaseData) super.clone();

            // Clone the nested classes
            clonedCaseData.animationSound = this.animationSound.clone();

            // Deep clone the map of items
            clonedCaseData.items = cloneItemsMap(this.items);

            // Deep clone the array of historyData
            clonedCaseData.historyData = cloneHistoryDataArray(this.historyData);

            return clonedCaseData;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * Clone method for CaseData deep clone
     */
    private static HistoryData[] cloneHistoryDataArray(HistoryData[] originalArray) {
        HistoryData[] newArray = new HistoryData[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            if(originalArray[i] != null) {
                newArray[i] = originalArray[i].clone();
            }
        }
        return newArray;
    }

    /**
     * Clone method for CaseData deep clone
     */
    private static Map<String, Item> cloneItemsMap(Map<String, Item> originalMap) {
        Map<String, Item> clonedMap = new HashMap<>();
        for (Map.Entry<String, Item> entry : originalMap.entrySet()) {
            clonedMap.put(entry.getKey(), entry.getValue().clone());
        }
        return clonedMap;
    }

    public String getCaseDisplayName() {
        return caseDisplayName;
    }

    public void setCaseDisplayName(String caseDisplayName) {
        this.caseDisplayName = caseDisplayName;
    }

    public Hologram getHologram() {
        return hologram;
    }
    public void setHologram(Hologram hologram) {
        this.hologram = hologram;
    }

    public static class Item implements Cloneable {
        private final String itemName;
        private String group;
        private int chance;
        private Material material;
        private String giveType;
        private List<String> actions;
        private List<String> alternativeActions;
        private Map<String,RandomAction> randomActions;
        private String[] rgb;

        public Item(String itemName, String group, int chance, Material material,
                    String giveType, List<String> actions, Map<String, RandomAction> randomActions, String[] rgb, List<String> alternativeActions) {
            this.itemName = itemName;
            this.group = group;
            this.chance = chance;
            this.material = material;
            this.giveType = giveType;
            this.actions = actions;
            this.randomActions = randomActions;
            this.rgb = rgb;
            this.alternativeActions = alternativeActions;
        }

        /**
         * Get map of random actions
         * @return random actions
         */
        public Map<String, RandomAction> getRandomActions() {
            return randomActions;
        }

        /**
         * Get random action
         * @param name random action name
         * @return CaseData.RandomAction
         */
        public RandomAction getRandomAction(String name) {
            return randomActions.getOrDefault(name, null);
        }

        /**
         * Set random actions
         * @param randomActions map of random actions
         */
        public void setRandomActions(Map<String, RandomAction> randomActions) {
            this.randomActions = randomActions;
        }

        /**
         * Get item actions
         * @return actions
         */
        public List<String> getActions() {
            return actions;
        }

        /**
         * Set item actions
         * @param actions actions
         */
        public void setActions(List<String> actions) {
            this.actions = actions;
        }

        /**
         * Get item give type
         * @return give type
         */
        public String getGiveType() {
            return giveType;
        }

        /**
         * Set item give type
         * @param giveType give type
         */
        public void setGiveType(String giveType) {
            this.giveType = giveType;
        }

        /**
         * Get item material (CaseData.Material)
         * @return CaseData.Material
         */
        public Material getMaterial() {
            return material;
        }

        /**
         * Set item material (CaseData.Material)
         * @param material CaseData.Material
         */
        public void setMaterial(Material material) {
            this.material = material;
        }

        /**
         * Get item chance
         * @return chance
         */
        public int getChance() {
            return chance;
        }

        /**
         * Set item chance
         * @param chance chance
         */
        public void setChance(int chance) {
            this.chance = chance;
        }

        /**
         * Get item group
         * @return grouo
         */
        public String getGroup() {
            return group;
        }

        /**
         * Set item group
         * @param group group
         */
        public void setGroup(String group) {
            this.group = group;
        }

        /**
         * Get item rgb
         * @return string massive
         */
        public String[] getRgb() {
            return rgb;
        }

        /**
         * Set item rgb
         * @param rgb string massive
         */
        public void setRgb(String[] rgb) {
            this.rgb = rgb;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "group='" + group + '\'' +
                    ", chance=" + chance +
                    ", material=" + material +
                    ", giveType='" + giveType + '\'' +
                    ", actions=" + actions +
                    ", randomActions=" + randomActions +
                    ", rgb=" + Arrays.toString(rgb) +
                    '}';
        }

        public String getItemName() {
            return itemName;
        }

        public List<String> getAlternativeActions() {
            return alternativeActions;
        }

        public void setAlternativeActions(List<String> alternativeActions) {
            this.alternativeActions = alternativeActions;
        }

        public static class RandomAction implements Cloneable {
            private int chance;
            private List<String> actions;
            private String displayName;

            public RandomAction(int chance, List<String> actions, String displayName) {
                this.chance = chance;
                this.actions = actions;
                this.displayName = displayName;
            }

            /**
             * Get random actions
             * @return random actions
             */
            public List<String> getActions() {
                return actions;
            }


            /**
             * Set random actions
             * @param actions random actions
             */
            public void setActions(List<String> actions) {
                this.actions = actions;
            }

            /**
             * Get random action chance
             * @return chance
             */
            public int getChance() {
                return chance;
            }

            /**
             * Set random action chance
             * @param chance chance
             */
            public void setChance(int chance) {
                this.chance = chance;
            }

            @Override
            public String toString() {
                return "RandomAction{" +
                        "chance=" + chance +
                        ", actions=" + actions +
                        '}';
            }
            @Override
            public RandomAction clone() {
                try {
                    return (RandomAction) super.clone();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }
        }
        public static class Material {
            private String id;
            private ItemStack itemStack;
            private String displayName;
            private boolean enchanted;

            public Material(String id, ItemStack itemStack, String displayName, boolean enchanted) {
                this.itemStack = itemStack;
                this.displayName = displayName;
                this.enchanted = enchanted;
                this.id = id;
            }

            /**
             * Get win item itemStack
             * @return itemStack
             */
            public ItemStack getItemStack() {
                return itemStack;
            }

            /**
             * Set itemStack for win item
             * @param itemStack itemStack
             */
            public void setItemStack(ItemStack itemStack) {
                this.itemStack = itemStack;
            }

            @Override
            public String toString() {
                return "Material{" +
                        "itemStack=" + itemStack +
                        ", displayName='" + displayName + '\'' +
                        ", enchanted=" + enchanted +
                        '}';
            }

            /**
             * Get item display name
             * @return display name
             */
            public String getDisplayName() {
                return displayName;
            }

            /**
             * Set item displayName
             * @param displayName display name
             */
            public void setDisplayName(String displayName) {
                this.displayName = displayName;
                if(this.itemStack.getItemMeta() != null) {
                    this.itemStack.getItemMeta().setDisplayName(displayName);
                }
            }

            /**
             * Check if item enchanted
             * @return boolean
             */
            public boolean isEnchanted() {
                return enchanted;
            }

            /**
             * Set item enchanted
             * @param enchanted boolean
             */
            public void setEnchanted(boolean enchanted) {
                if (enchanted) {
                    this.itemStack.addUnsafeEnchantment(Enchantment.LURE, 1);
                } else {
                    this.itemStack.removeEnchantment(Enchantment.LURE);
                }
                this.enchanted = enchanted;
            }

            /**
             * Material id like HDB:1234, HEAD:name, RED_WOOL etc.
             * @return id
             */
            public String getId() {
                return id;
            }

            /**
             * Set material id
             * @param id material id
             */
            public void setId(String id) {
                this.id = id;
            }
        }

        @Override
        public Item clone() {
            try {
                Item clonedItem = (Item) super.clone();

                clonedItem.randomActions = cloneRandomActionsMap(this.randomActions);

                return clonedItem;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        /**
         * Clone method for CaseData deep clone
         */
        private static Map<String, RandomAction> cloneRandomActionsMap(Map<String, RandomAction> originalMap) {
            Map<String, RandomAction> clonedMap = new HashMap<>();
            for (Map.Entry<String, RandomAction> entry : originalMap.entrySet()) {
                clonedMap.put(entry.getKey(), entry.getValue().clone());
            }
            return clonedMap;
        }

    }

    public static class AnimationSound implements Cloneable {
        private Sound sound;
        private float volume;
        private float pitch;

        public AnimationSound(Sound sound, float volume, float pitch) {
            this.sound = sound;
            this.volume = volume;
            this.pitch = pitch;
        }

        /**
         * Get animation sound
         * @return Bukkit sound
         */
        public Sound getSound() {
            return sound;
        }

        /**
         * Set animation sound
         * @param sound Bukkit sound
         */
        public void setSound(Sound sound) {
            this.sound = sound;
        }

        /**
         * Get animation sound volume
         * @return volume
         */
        public float getVolume() {
            return volume;
        }

        /**
         * Set animation sound volume
         * @param volume volume
         */
        public void setVolume(float volume) {
            this.volume = volume;
        }

        /**
         * Get animation sound pitch
         * @return pitch
         */
        public float getPitch() {
            return pitch;
        }

        /**
         * Set animation sound pitch
         * @param pitch pitch
         */

        public void setPitch(float pitch) {
            this.pitch = pitch;
        }

        @Override
        public String toString() {
            return "AnimationSound{" +
                    "sound=" + sound +
                    ", volume=" + volume +
                    ", pitch=" + pitch +
                    '}';
        }

        @Override
        public AnimationSound clone() {
            try {
                return (AnimationSound) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }
    }
    /**
     * Class to implement information about case opening histories
     */

    public static class HistoryData implements Cloneable {
        private int id;

        public void setItem(String item) {
            this.item = item;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public void setCaseType(String caseType) {
            this.caseType = caseType;
        }

        public void setAction(String action) {
            this.action = action;
        }

        private String item;
        private String playerName;
        private long time;
        private String group;
        private String caseType;
        private String action;
        public HistoryData() {}

        public HistoryData(String item, String caseType, String playerName, long time, String group, String action) {
            this.item = item;
            this.playerName = playerName;
            this.time = time;
            this.group = group;
            this.caseType = caseType;
            this.action = action;
        }

        @Override
        public String toString() {
            return "HistoryData{" +
                    "playerName='" + playerName + '\'' +
                    ", time=" + time +
                    ", group='" + group + '\'' +
                    ", caseType='" + caseType + '\'' +
                    ", action='" + action + '\'' +
                    '}';
        }

        @Override
        public HistoryData clone() {
            try {
                return (HistoryData) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        /**
         * Get case type
         * @return case type
         */
        public String getCaseType() {
            return caseType;
        }

        /**
         * Get action (like group, but from randomactions section)
         * @return action
         */

        public String getAction() {
            return action;
        }

        public String getItem() {
            return item;
        }
    }


    public static class Hologram {

        private final boolean enabled;
        private final double height;
        private final int range;
        private final List<String> messages;

        /**
         * Empty constructor
         */
        public Hologram() {
            this.enabled = false;
            this.height = 0.0;
            this.range = 8;
            this.messages = new ArrayList<>();
        }

        /**
         * A secondary constructor to build a hologram.
         *
         * @param enabled if the hologram enabled or not
         * @param height of the hologram from the ground
         * @param range hologram visibility range (only works if this feature is supported in hologram plugins)
         * @param messages the hologram will display
         */
        public Hologram(boolean enabled, double height, int range, List<String> messages) {
            this.enabled = enabled;
            this.height = height;
            this.range = range;
            this.messages = messages;
        }

        /**
         * Check if the hologram is enabled or not.
         *
         * @return true if yes otherwise false.
         */
        public boolean isEnabled() {
            return enabled;
        }

        /**
         * Gets the range at which a hologram can be seen.
         *
         * @return the range
         */
        public int getRange() {
            return range;
        }

        /**
         * Get the height of the hologram from the ground.
         *
         * @return the height
         */
        public double getHeight() {
            return height;
        }

        /**
         * Get the messages the hologram will display.
         *
         * @return the list of messages
         */
        public List<String> getMessages() {
            return messages;
        }
    }

}