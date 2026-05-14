package com.talent.batch11.day6.homeworksDay6ByShin.homeworkEmployee;

public class SalariedEmployee extends Employee {
    public double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    public String toString() {
        return "Employee ID: " + id + " | Name: " + name + " | Monthly Pay: " + calculatePay();
    }
}