package com.talent.batch11.day05.homeworks;

public class Laptop {
    private String brand;
    private int ram;
    private double price;


    public Laptop(String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public int getRam() {
        return ram;
    }
    public double getPrice() {
        return price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Acer", 8, 500.0);
        System.out.println("Before Update: " + myLaptop.getRam() + "GB");
        myLaptop.setRam(16);
        System.out.println("After Update: " + myLaptop.getRam() + "GB");
    }
}
