package com.talent.batch11.day05.homeworks;

public class counter {

        // 1. Variables
        public int instanceCount = 0;       // Personal Wallet
        public static int globalCount = 0;  // Shared Piggy Bank

        // 2. Constructor (Must match the Class name exactly)
        public counter() {
            instanceCount++;
            globalCount++;
        }

        public static void main(String[] args) {
            // 3. Creating 3 separate objects
            counter c1 = new counter();
            counter c2 = new counter();
            counter c3 = new counter();

            // 4. Printing the results
            System.out.println("c3 Instance Count: " + c3.instanceCount); // Fixed typo
            System.out.println("Global Count: " + counter.globalCount);
        }
    }

