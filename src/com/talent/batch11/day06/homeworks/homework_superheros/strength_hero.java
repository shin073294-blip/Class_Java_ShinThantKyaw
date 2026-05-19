package com.talent.batch11.day06.homeworks.homework_superheros;

public class strength_hero extends superheros{
    public strength_hero(String name, int level) {
        super(name, level);
    }
    public void usePower() {
        System.out.println(getHeroName() + " is lifting the car!");
    }
}
