package com.talent.batch11.day6.homeworksDay6ByShin.homeworkBook;

public class Book {

    public String title;
    public String author;
    public double price;

    public Book(String title, String author, double price) {
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
