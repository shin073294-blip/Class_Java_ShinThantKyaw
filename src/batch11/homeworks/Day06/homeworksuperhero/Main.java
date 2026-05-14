package com.talent.batch11.day6.homeworksDay6ByShin.homeworksuperhero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Superhero> heroList = new ArrayList<>();


        heroList.add(new FlyingHero("Invincible", 80));
        heroList.add(new StrengthHero("Omni Man", 95));
        heroList.add(new SpeedHero("Flash", 90));

        System.out.println("--- Superhero Action Phase ---");


        for (Superhero hero : heroList) {


            System.out.println("Hero: " + hero.heroName + " | Current Power: " + hero.powerLevel);

            hero.usePower();

            hero.powerBoost(25);

            System.out.println("After Boost, Power is now: " + hero.powerLevel);
            System.out.println("------------------------------");
        }
    }
}
