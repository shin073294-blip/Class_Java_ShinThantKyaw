package com.talent.batch11.day06.homeworks.homework_employees;

public class hourly extends employees {

    private double hourlyRate;
    private double hoursWorked;


    public hourly(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id); // Passes name and id to the parent employees class
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        if (hoursWorked > 40) {
            double regularPay = 40 * hourlyRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyRate * 1.5);
            return regularPay + overtimePay;
        } else {
            return hourlyRate * hoursWorked;
        }
    }

    @Override
    public String toString() {
        return "Employee ID: " + getId() + " | Name: " + getName() + " | Total Pay: $" + calculatePay();
    }
}
