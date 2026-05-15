package com.talent.batch11.day08.homeworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class students {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Kyaw", 80);
        students.put("Kelvin", 70);
        students.put("Harry", 42);
        students.put("Jason", 88);

        Iterator<Map.Entry<String, Integer>> it = students.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Please Enter Student Name:");
        String searchName = scanner.nextLine();


        if (students.containsKey(searchName)) {
            int mark = students.get(searchName);
            System.out.println("=================================================");
            System.out.println(searchName + "'s mark is" + " " + mark);
            System.out.println("=================================================");
        } else {
            System.out.println("=================================================");
            System.out.println("Umm Try again." + " " + searchName + "?" + " " + "Didn't find this student");
            System.out.println("=================================================");
        }


        System.out.println("Do you want to delete any students");
        String deletestudent = scanner.nextLine();

        if (students.containsKey(deletestudent)) {
                students.remove(deletestudent);
            System.out.println("=================================================");
            System.out.println("Success! " + deletestudent + " has been removed.");
            System.out.println("=================================================");
            System.out.println("Remaining Students:" + students);
            System.out.println("=================================================");
        }


    }
    }


