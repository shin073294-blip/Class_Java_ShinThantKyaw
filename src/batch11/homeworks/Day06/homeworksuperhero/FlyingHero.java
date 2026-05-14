package com.talent.batch11.day6.homeworksDay6ByShin.homeworksuperhero;

public class FlyingHero extends Superhero {
    public FlyingHero(String name, int level) {
        super(name, level);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " is soaring through the sky!");
    }
}
