package com.talent.batch11.day03.homeworks;

import java.util.Scanner;

public class vowels {
    static int countVowels(String input){
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = scanner.next();
        System.out.println(countVowels(word));
    }
}
