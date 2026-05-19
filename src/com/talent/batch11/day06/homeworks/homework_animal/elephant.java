package com.talent.batch11.day06.homeworks.homework_animal;

import javax.naming.Name;

public class elephant extends animal{
    public elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: TRUMPET!");
    }
}
