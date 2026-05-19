package com.talent.batch11.day06.homeworks.homework_books;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<books> library = new ArrayList<>();

        library.add(new books("The Great Gatsby", "F. Scott Fitzgerald", 20.0));
        library.add(new books("1984", "George Orwell", 15.0));
        library.add(new books("The Hobbit", "J.R.R. Tolkien", 25.0));

        System.out.println("--- Library Catalog ---");

        for (books myBook : library) {
            System.out.println("Title: " + myBook.title + " | Author: " + myBook.author);
            System.out.println("Original Price: $" + myBook.price);


            double newPrice = myBook.makeDiscount(10);

            System.out.println("Price after 10% discount: $" + newPrice);
            System.out.println("--------------------------------");
        }
    }
}
