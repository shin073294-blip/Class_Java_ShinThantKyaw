package com.talent.batch11.day6.homeworksDay6ByShin.homeworkAnimal;

public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }


    public void makeSound() {
        System.out.println(name + " says: TRUMPET!");
    }
}
