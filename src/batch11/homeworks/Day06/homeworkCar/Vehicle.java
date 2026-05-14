package com.talent.batch11.day6.homeworksDay6ByShin.homeworkCar;

public class Vehicle {

    public String country;
    public int year;
    public int fuelLevel;
    public String vehicleType;

    public Vehicle(String country, int year, int fuelLevel, String vehicleType) {
        this.country = country;
        this.fuelLevel= fuelLevel;
        this.year= year;
        this.vehicleType=vehicleType;
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
