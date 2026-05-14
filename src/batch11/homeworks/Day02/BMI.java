package batch11.homeworks.Day02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter your weight(lbs)");
        int weight= scanner.nextInt();

        System.out.println("Please Enter your height(feet)");
        int height= scanner.nextInt();


        double bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");

        } else if (bmi < 30) {
            System.out.println("Category: Overweight");

        } else {
            System.out.println("Category: Obese");
        }
    }
}
