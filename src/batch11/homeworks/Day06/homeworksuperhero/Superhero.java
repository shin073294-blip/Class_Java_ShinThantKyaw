package com.talent.batch11.day6.homeworksDay6ByShin.homeworksuperhero;

public abstract class Superhero {

    public String heroName;
    public int powerLevel;

    public Superhero(String name, int level) {
        this.heroName = name;
        this.powerLevel = level;
    }

    public abstract void usePower();


    public void powerBoost(int amount){
        this.powerLevel = this.powerLevel + amount;
    }
}



