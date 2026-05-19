package com.talent.batch11.day03.homeworks;

public class prime_array {
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

        int[] numbers = {2, 4, 5, 8, 11, 15, 17};

        int count = 0;

        for(int i = 0; i < numbers.length; i++){

            if(isPrime(numbers[i]) == 1){
                count++;
            }

        }

        System.out.println("Prime numbers count: " + count);

    }
}
