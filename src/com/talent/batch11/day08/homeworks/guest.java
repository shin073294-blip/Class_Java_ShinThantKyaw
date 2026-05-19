package com.talent.batch11.day08.homeworks;

import java.util.HashSet;
import java.util.Scanner;

public class guest {

        public static void main(String[] args) {
            HashSet<String> guests = new HashSet<>();
            guests.add("Alice");
            guests.add("Alice");
            guests.add("Mark");
            guests.add("Miles");
            guests.add("Kelvin");
            guests.add("Lily");

            System.out.println(guests);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Type a name to search, or 'remove Name' to delete:");
            String input = scanner.nextLine(); // Get the whole line
            if (input.startsWith("remove")) {

                String nameToRemove = input.replace("remove ", "");

                if (guests.remove(nameToRemove)) {
                    System.out.println("Result: " + nameToRemove + " is gone!");
                } else {
                    System.out.println("Result: " + nameToRemove + " isn't here.");
                }
            }

            else if (guests.contains(input)) {
                System.out.println("Result: " + input + " was found!");
            }

            else {
                System.out.println("Result: " + input + " - Umm wrong one! Try again?");
            }
        }
    }


