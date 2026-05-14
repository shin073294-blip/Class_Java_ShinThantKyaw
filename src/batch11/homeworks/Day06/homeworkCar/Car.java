package com.talent.batch11.day6.homeworksDay6ByShin.homeworkCar;

public class Car extends Vehicle {

    public Car(String country, int year, int fuelLevel, String vehicleType) {
        super(country, year, fuelLevel, vehicleType);
    }

    public String getVehicleType(){
        return ("Car");
    }

    public static void main(String[] args) {
        Car c1= new Car("Germany",2000, 100, "Car");
        System.out.println(c1.country+ "   "+ c1.year + "  "+c1.fuelLevel+ "  "+c1.vehicleType);
        System.out.println(c1.getVehicleType());
    }

}
