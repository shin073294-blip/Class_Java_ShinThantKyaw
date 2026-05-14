package com.talent.batch11.day6.homeworksDay6ByShin.homeworkCar;

public class Motorcycle extends Vehicle{

    public Motorcycle(String country, int year, int fuelLevel, String vehicleType) {
        super(country, year, fuelLevel, vehicleType);
    }

    public String getVehicleType(){
        return "Motorbike";
    }

    public static void main(String[] args) {
        Motorcycle b1= new Motorcycle("Japan",2010, 100, "MotorBike");
        System.out.println(b1.country+ "   "+ b1.year+ "   "+ b1.fuelLevel+ "   "+ b1.vehicleType);
        System.out.println(b1.getVehicleType());
    }
}
