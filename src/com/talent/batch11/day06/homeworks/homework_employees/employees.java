package com.talent.batch11.day06.homeworks.homework_employees;

public abstract class employees {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double calculatePay(){
        return 0.0;
    }
}
