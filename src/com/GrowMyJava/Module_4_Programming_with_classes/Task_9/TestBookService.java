package com.GrowMyJava.Module_4_Programming_with_classes.Task_9;

public class TestBookService {

    public static void main(String[] args) {
        Book[] books = {
                new Book(128, "Angels and Demons", "Dan Brown", "Alpha", 2000, 700, 25, "Hard cover"),
                new Book(64, "The Da Vinci Code", "Dan Brown", "Alpha", 2003, 799, 29.99, "Hard cover"),
                new Book(256, "The Hound of the Baskervilles", "Arthur Conan Doyle", "England", 1902, 350, 19.99, "Hard cover"),
                new Book(32, "Inferno", "Dan Brown", "Alpha", 2013, 1111, 35.99, "Hard cover"),
        };

        BookService bookService = new BookService("Detective", books);

        //bookService.print();
        System.out.println("------------------------------------");
        bookService.getBooksByAuthor("Bro");
        System.out.println("------------------------------------");
        bookService.getBooksByPublishing("England");
        System.out.println("------------------------------------");
        bookService.getBooksPublishedAfterGivenYear(2002);
    }
}
