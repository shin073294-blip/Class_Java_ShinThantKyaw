package com.talent.batch11.day08.homeworks;

import java.util.*;

public class college {
    public static void main(String[] args) {
        List<String> names= new ArrayList<String>();
        names.add ("Kyaw Kyaw");
        names.add("Su Su");
        names.add("Ko Phyo");
        names.add("Mi Ni");


        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("Myanmar");
        subjects.add("English");
        subjects.add("Chemistry");
        subjects.add("Physics");
        subjects.add("Biology");
        subjects.add("Math");
        subjects.add("Eco");


        Map<String, Set<String>> studentMap = new TreeMap<>();

        Set<String> KyawKyawSubjects = new TreeSet<>();
        KyawKyawSubjects.add("Math");
        KyawKyawSubjects.add("English");
        KyawKyawSubjects.add("Chemistry");
        subjects.add("Biology");
        studentMap.put("Kyaw Kyaw", KyawKyawSubjects);

        Set<String> SUSUSubjects = new TreeSet<>();
        SUSUSubjects.add("Math");
        SUSUSubjects.add("Eco");
        studentMap.put("Su Su", SUSUSubjects);

        Set<String> KoPhyoSubjects = new TreeSet<>();
        KoPhyoSubjects.add("Physics");
        KoPhyoSubjects.add("Chemistry");
        KoPhyoSubjects.add("Eco");
        studentMap.put("Ko Phyo", KoPhyoSubjects);

        Set<String> MiNiSubjects = new TreeSet<>();
        MiNiSubjects.add("Physics");
        MiNiSubjects.add("Chemistry");
        MiNiSubjects.add("Biology");
        studentMap.put("Mi Ni", MiNiSubjects);

        for (String name : studentMap.keySet()) {
            System.out.println("Student: " + name + " -> Subjects: " + studentMap.get(name));
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to do!");
            System.out.println("===================================");
            System.out.println("01. Search Student");
            System.out.println("02. Add Student");
            System.out.println("03. Delete Student");
            System.out.println("===================================");
            System.out.println("Please choose your option");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("You selected: 01. Add a subject to a student");
            } else if (option == 2) {
                System.out.println("You selected: 02. Remove a subject from a student");
            } else if (option == 3) {
                System.out.println("You selected: 03. Display unique department subjects");
            } else if (option == 4) {
                System.out.println("You selected: 04. Exit");
            } else {
                System.out.println("Invalid option selected. Try again.");
                continue;
            }

            System.out.print("Do you want to proceed? (yes/no): ");
            String confirm = scanner.nextLine().trim().toLowerCase();

            if (!confirm.equals("yes") && !confirm.equals("y")) {
                System.out.println("Action cancelled. Returning to main menu.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String showStudent = scanner.nextLine();
                    if (studentMap.containsKey(showStudent)) {
                        System.out.println("Student Found! " + showStudent + " -> " + studentMap.get(showStudent));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    String addStudent = scanner.nextLine();
                    if (studentMap.containsKey(addStudent)) {
                        System.out.print("Enter subject to add: ");
                        String addSubject = scanner.nextLine();
                        studentMap.get(addStudent).add(addSubject);
                        System.out.println("Updated successfully! " + addStudent + " -> " + studentMap.get(addStudent));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    String removeStudent = scanner.nextLine();
                    if (studentMap.containsKey(removeStudent)) {
                        System.out.print("Enter subject to remove: ");
                        String removeSubject = scanner.nextLine();
                        boolean removed = studentMap.get(removeStudent).remove(removeSubject);
                        if (removed) {
                            System.out.println("Updated successfully! " + removeStudent + " -> " + studentMap.get(removeStudent));
                        } else {
                            System.out.println("Subject not found for this student.");
                        }
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;


            }
        }

        

    }
}
