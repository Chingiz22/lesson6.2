package com.company;

public class GameEntity {

    private String bossName;
    private int bossHealth;
    private int bossAttack;
    private String heroName;
    private int heroHealth;
    private int heroAttack;

    public String getBoss() {
        return bossName;
    }

    public void setBoss(String boss) {
        this.bossName = boss;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossAttack() {
        return bossAttack;
    }

    public void setBossAttack(int bossAttack) {
        this.bossAttack = bossAttack;
    }

    public String getHero() {
        return heroName;
    }

    public void setHero(String hero) {
        this.heroName = hero;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroAttack() {
        return heroAttack;
    }

    public void setHeroAttack(int heroAttack) {
        this.heroAttack = heroAttack;
    }
}
