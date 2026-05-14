package com.talent.batch11.day2.homework;

import java.util.Scanner;

public class Mark {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your marks");

        System.out.print("Subject01: ");
        int mark1 = scanner.nextInt();

        System.out.print("Subject02: ");
        int mark2 = scanner.nextInt();

        System.out.print("Subject03: ");
        int mark3 = scanner.nextInt();

        System.out.print("Subject04: ");
        int mark4 = scanner.nextInt();

        System.out.print("Subject05: ");
        int mark5 = scanner.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;

        double average = total / 5.0;

        System.out.println("Average Percentage: " + average);

        if (average >= 90) {

            System.out.println("Grade A");

        } else if (average >= 80) {

            System.out.println("Grade B");

        } else if (average >= 70) {

            System.out.println("Grade C");

        } else if (average >= 60) {

            System.out.println("Grade D");

        } else {

            System.out.println("Grade F");

        }

        scanner.close();
    }
}
