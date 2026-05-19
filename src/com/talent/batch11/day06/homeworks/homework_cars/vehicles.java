package com.talent.batch11.day06.homeworks.homework_cars;

public class vehicles {

    private String country;
    private int year;
    private int fuelLevel;
    private String vehicleType;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public vehicles(String country, int year, int fuelLevel, String vehicleType) {
        this.country = country;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType(){
        return ("What is your vehicle");
    }

    public void StartEngine(){
        System.out.println("Engine has started");
    }
    public void drive(){
        System.out.println("Driving now");
    }

}
