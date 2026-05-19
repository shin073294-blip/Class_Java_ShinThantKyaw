package com.talent.batch11.day03.homeworks;

public class prime_numbers {
    static int isPrime(int n){

        if(n <= 1){
            return 0;
        }

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                return 0;
            }

        }

        return 1;
    }

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){

            if(isPrime(i) == 1){
                System.out.println(i);
            }

        }

    }
}
