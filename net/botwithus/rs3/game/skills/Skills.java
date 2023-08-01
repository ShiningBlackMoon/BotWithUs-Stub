package net.botwithus.rs3.game.skills;

import net.botwithus.rs3.events.impl.SkillUpdateEvent;

public enum Skills {
    AGILITY,
    ARCHAEOLOGY,
    ATTACK,
    CONSTITUTION,
    CONSTRUCTION,
    COOKING,
    CRAFTING,
    DEFENSE,
    DIVINATION,
    DUNGEONEERING,
    FARMING,
    FIREMAKING,
    FISHING,
    FLETCHING,
    HERBLORE,
    HUNTER,
    INVENTION,
    MAGIC,
    MINING,
    PRAYER,
    RANGED,
    RUNECRAFTING,
    SLAYER,
    SMITHING,
    STRENGTH,
    SUMMONING,
    THIEVING,
    NECROMANCY,
    UNKNOWN,
    WOODCUTTING;

    public static Skills byId(int id) { return null; }
    public int getActualLevel() { return -1; }
    public int getExperienceAt(int level) { return -1; }
    public int getExperienceToNextLevel() { return -1; }
    public int getId() { return -1; }
    public int getLevel() { return -1; }
    public int getLevelAtExperience(Skill skill, int experience) { return -1; }
    public Skill getSkill() { return null; }
    public boolean isEliteSkill() { return false; }
    public static void receiveSkillUpdateEvent(SkillUpdateEvent event) {}
}
