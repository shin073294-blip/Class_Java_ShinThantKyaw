package com.talent.batch11.day06.homeworks.homework_animal;

public class lion extends animal {
    public lion(String name, int age) {
        super(name, age);
    }

@Override
    public void makeSound() {
        System.out.println(getName() + " says: ROAR!");
    }
}
