package com.talent.batch11.day02.homeworks;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Balance");
        int number = scanner.nextInt();

        System.out.println("Your Balance is " + number);

        System.out.println("Deposit, Withdraw, CheckBalance, Exit");
        String text = scanner.next();

        if (text.equals("Deposit")) {

            System.out.println("Please Enter Amount");
            int amount = scanner.nextInt();

            System.out.println("You now have " + (number + amount));

        } else if (text.equals("Withdraw")) {

            System.out.println("Please Enter Amount");
            int amount = scanner.nextInt();

            System.out.println("You now have " + (number - amount));

        } else if (text.equals("CheckBalance")) {

            System.out.println("Your balance is " + number);

        } else if (text.equals("Exit")) {

            System.out.println("Program Closed");

        } else {

            System.out.println("Sorry Invalid option");

        }

        scanner.close();
    }
}
