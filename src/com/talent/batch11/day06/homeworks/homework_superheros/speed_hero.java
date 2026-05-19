package com.talent.batch11.day06.homeworks.homework_superheros;

public class speed_hero extends superheros{
    public speed_hero(String name, int level) {
        super(name, level);
    }
    public void usePower(){
        System.out.println(getHeroName()+"is running faster speed of light");
    }
}
