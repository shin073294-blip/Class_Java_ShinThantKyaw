package com.talent.batch11.day06.homeworks.homework_superheros;

public class flying_hero extends superheros{
    public flying_hero(String name, int level) {
        super(name, level);
    }
    @Override
    public void usePower() {
        System.out.println(getHeroName() + " is soaring through the sky!");
    }
}
