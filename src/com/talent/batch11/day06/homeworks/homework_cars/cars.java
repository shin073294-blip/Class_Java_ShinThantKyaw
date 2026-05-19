package com.talent.batch11.day06.homeworks.homework_cars;

public class cars extends vehicles {

    public cars(String country, int year, int fuelLevel, String vehicleType) {
        super(country, year, fuelLevel, vehicleType);
    }

    public String getVehicleType(){
        return ("cars");
    }

    public static void main(String[] args) {
        cars c1= new cars("Germany",2000, 100, "Car");
        System.out.println(c1.getCountry()+ "   "+ c1.getYear() + "  "+c1.getFuelLevel()+ "  "+c1.getVehicleType());
        System.out.println(c1.getVehicleType());
    }
}
