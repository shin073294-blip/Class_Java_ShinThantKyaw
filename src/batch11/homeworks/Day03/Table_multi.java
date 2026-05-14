package com.talent.batch11.day3.homeworks;

public class Table_multi {

    static void printTable(int number , int row ) {
        for (int i = 1; i <= row; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
            printTable(5, 10);
    }
}
