package com.talent.batch11.day3.homeworks;

import java.util.Arrays;

public class Calculator_Project {

    static int first_method(int x, int y){
        return x * y;
    }

    static  int second_method(int x, int y , int z){
        return x * y * z;
    }

    public static void main(String[] args) {
        System.out.println(first_method(3,5));
        System.out.println(second_method(3,4,6));
    }
}
