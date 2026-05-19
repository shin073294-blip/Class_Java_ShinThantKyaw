
package com.talent.batch11.day06.homeworks.homework_animal;

import java.util.ArrayList;
import java.util.List;

    public class zoo {
        public static void main(String[] args) {
            // The list holds 'animal' types
            List<animal> myZoo = new ArrayList<>();

            // Assuming your 'lion' class is structured just like elephant
            myZoo.add(new lion("Simba", 5));
            myZoo.add(new elephant("Dumbo", 10));
            myZoo.add(new lion("Nala", 4));

            System.out.println("--- Welcome to the Zoo ---");
            for (animal animal : myZoo) {
                animal.displayInfo();
                animal.makeSound();
                System.out.println("--------------------------");
            }
        }
    }



