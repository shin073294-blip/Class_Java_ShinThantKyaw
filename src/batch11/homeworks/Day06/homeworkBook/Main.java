package com.talent.batch11.day6.homeworksDay6ByShin.homeworkBook;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        List<Book> library = new ArrayList<>();

        library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 20.0));
        library.add(new Book("1984", "George Orwell", 15.0));
        library.add(new Book("The Hobbit", "J.R.R. Tolkien", 25.0));

        System.out.println("--- Library Catalog ---");

        for (Book myBook : library) {
            System.out.println("Title: " + myBook.title + " | Author: " + myBook.author);
            System.out.println("Original Price: $" + myBook.price);


            double newPrice = myBook.makeDiscount(10);

            System.out.println("Price after 10% discount: $" + newPrice);
            System.out.println("--------------------------------");
        }
    }
}
