package com.talent.batch11.day06.homeworks.homework_cars;

public class motorcycle extends vehicles{

        public motorcycle(String country, int year, int fuelLevel, String vehicleType) {
            super(country, year, fuelLevel, vehicleType);
        }

        public String getVehicleType(){
            return "Motorbike";
        }

        public static void main(String[] args) {
            motorcycle b1= new motorcycle("Japan",2010, 100, "MotorBike");
            System.out.println(b1.getCountry()+ "   "+ b1.getYear()+ "   "+ b1.getFuelLevel()+ "   "+ b1.getVehicleType());
            System.out.println(b1.getVehicleType());
        }
    }

