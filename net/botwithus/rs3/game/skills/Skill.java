package net.botwithus.rs3.game.skills;

public class Skill {
    public Skill(int id, Skills skills, int level, int experience, int actualLevel, int maxLevel) {}
    public int getActualLevel() { return -1; }
    public int getExperience() { return -1; }
    public int getId() { return -1; }
    public int getLevel() { return -1; }
    public int getMaxLevel() { return -1; }
    public boolean isEliteSkill() { return false; }
    public void update(int level, int experience, int actualLevel, int maxLevel) {}
}
