package com.talent.batch11.day6.homeworksDay6ByShin.homeworkAnimal;

import java.util.List;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        List<Animal> myZoo = new ArrayList<>();

        myZoo.add(new Lion("Simba", 5));
        myZoo.add(new Elephant("Dumbo", 10));
        myZoo.add(new Lion("Nala", 4));

        System.out.println("--- Welcome to the Zoo ---");
        for (Animal animal : myZoo) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println("--------------------------");
        }
    }
}
