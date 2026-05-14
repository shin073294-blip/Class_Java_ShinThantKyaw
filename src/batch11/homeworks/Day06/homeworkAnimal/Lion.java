package com.talent.batch11.day6.homeworksDay6ByShin.homeworkAnimal;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }


    public void makeSound() {
        System.out.println(name + " says: ROAR!");
    }
}