package com.talent.batch11.day06.homeworks.homework_superheros;

public abstract class superheros {

   private String heroName;
   private int powerLevel;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }


    public superheros(String name, int level) {
        this.heroName = name;
        this.powerLevel = level;
    }

    public abstract void usePower();


    public void powerBoost(int amount){
        this.powerLevel = this.powerLevel + amount;
    }
}
