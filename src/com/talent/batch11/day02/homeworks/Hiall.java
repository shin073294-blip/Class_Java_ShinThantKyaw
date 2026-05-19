package com.talent.batch11.day02.homeworks;

public class Hiall {

        public static String flip(String text) {
            String result = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                result = result + text.charAt(i);
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "Hi All!";
            String output = flip(input);

            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }
    }

