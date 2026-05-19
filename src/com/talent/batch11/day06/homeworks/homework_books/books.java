package com.talent.batch11.day06.homeworks.homework_books;

public class books {
    public String title;
    public String author;
    public double price;

    public books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public double makeDiscount(int percent) {
        double discountAmount = this.price * (percent / 100.0);
        this.price = this.price - discountAmount;
        return this.price;
    }
}
