package batch11.homeworks.Day07.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();


        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(103, "Charlie"));
        students.add(new Student(104, "David"));
        students.add(new Student(105, "Eve"));


        System.out.println("--- Full Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Total students: " + students.size());


        String searchName = "Charlie";
        System.out.println("Searching for: " + searchName);
        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Result: Found Student ID " + s.id);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.");


        int idToRemove = 102;
        System.out.println("\nRemoving student with ID: " + idToRemove);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.id == idToRemove) {
                iterator.remove();
                System.out.println("Student removed successfully.");
            }
        }



    }
}
