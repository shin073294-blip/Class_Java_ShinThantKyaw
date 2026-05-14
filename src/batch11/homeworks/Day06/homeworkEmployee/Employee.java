package com.talent.batch11.day6.homeworksDay6ByShin.homeworkEmployee;

public abstract class Employee {
    public String name;
    public int id;

    public Employee(String name, int id) {
        this.name=name;
        this.id = id;
    }
    public double calculatePay(){
        return 0.0;
    }
}
