package com.talent.batch11.day6.homeworksDay6ByShin.homeworkEmployee;

public class HourlyEmployee extends Employee {
    public double hourlyRate;
    public double hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id); // Pass name and id to the Parent (Employee)
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double calculatePay() {
        if (hoursWorked > 40) {
            double regularPay = 40 * hourlyRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyRate * 1.5); // 1.5x for overtime
            return regularPay + overtimePay;
        } else {
            return hourlyRate * hoursWorked;
        }
    }


    public String toString() {
        return "Employee ID: " + id + " | Name: " + name + " | Total Pay: " + calculatePay();
    }
}
