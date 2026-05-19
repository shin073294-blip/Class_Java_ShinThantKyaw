package com.talent.batch11.day06.homeworks.homework_employees;

public class salaried extends employees {
    private double annualSalary;

    public salaried(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    @Override
    public String toString() {
        return "Employee ID: " + getId() + " | Name: " + getName() + " | Monthly Pay: " + calculatePay();
    }
}