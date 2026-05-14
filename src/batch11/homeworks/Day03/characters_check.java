package com.talent.batch11.day3.homeworks;
import java.util.Scanner;
public class characters_check {

        static void countCharacters(String input){

            int letters = 0;
            int digits = 0;
            int special = 0;

            for(int i = 0; i < input.length(); i++){

                char ch = input.charAt(i);

                if(ch >= 'a' && ch <= 'z'){
                    letters++;
                }
                else if(ch >= '0' && ch <= '9'){
                    digits++;
                }
                else{
                    special++;
                }
            }

            System.out.println("Letters: " + letters);
            System.out.println("Digits: " + digits);
            System.out.println("Special: " + special);
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter text:");
            String input = scanner.next();

            countCharacters(input);
        }
    }

