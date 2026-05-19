package com.talent.batch11.day03.homeworks;

public class multi_table {
    static void printTable(int number , int row ) {
        for (int i = 1; i <= row; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        printTable(5, 10);
    }
}
