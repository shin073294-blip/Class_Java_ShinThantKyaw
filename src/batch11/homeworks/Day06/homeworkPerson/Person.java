package com.talent.batch11.day6.homeworksDay6ByShin.homeworkPerson;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public String getRole(){
        return "Who are you";
    }

    public void introduce(){
        System.out.println("HI");
    }
}
