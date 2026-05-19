package com.talent.batch11.day07.homeworks.student;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();


        students.add(new student(101, "Alice"));
        students.add(new student(102, "Bob"));
        students.add(new student(103, "Charlie"));
        students.add(new student(104, "David"));
        students.add(new student(105, "Eve"));


        System.out.println("--- Full Student List ---");
        for (student s : students) {
            System.out.println(s);
        }

        System.out.println("Total students: " + students.size());


        String searchName = "Charlie";
        System.out.println("Searching for: " + searchName);
        boolean found = false;
        for (student s : students) {
            if (s.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Result: Found Student ID " + s.getId());
                found = true;
                break;
            }
        }
        //the code under is short term for boolean found = false
        if (!found) {
            System.out.println("Student not found.");
        }

        int idToRemove = 102;
        System.out.println("\nRemoving student with ID: " + idToRemove);

        Iterator<student> iterator = students.iterator();
        while (iterator.hasNext()) {
            student s = iterator.next();
            if (s.getId() == idToRemove) {
                iterator.remove();
                System.out.println("Student removed successfully.");
            }
        }



    }
}
