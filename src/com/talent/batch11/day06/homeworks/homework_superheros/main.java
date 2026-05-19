package com.talent.batch11.day06.homeworks.homework_superheros;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


        ArrayList<superheros> heroList = new ArrayList<>();


        heroList.add(new flying_hero("Invincible", 80));
        heroList.add(new strength_hero("Omni Man", 95));
        heroList.add(new speed_hero("Flash", 90));

        System.out.println("--- Superhero Action Phase ---");


        for (superheros hero : heroList) {


            System.out.println("Hero: " + hero.getHeroName() + " | Current Power: " + hero.getPowerLevel());

            hero.usePower();

            hero.powerBoost(25);

            System.out.println("After Boost, Power is now: " + hero.getPowerLevel());
            System.out.println("------------------------------");
        }
    }
}
