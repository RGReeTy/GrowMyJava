package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_9;

public class BookService {
    //9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
    //метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    //Найти и вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года.

    private String serviceName;
    private Book[] books;

    public BookService(String name, Book[] books) {
        this.serviceName = name;
        this.books = books;
    }

    //a) список книг заданного автора;
    public void getBooksByAuthor(String name) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().contains(name)) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Collection has not contains any book by author's name" + '\'' + name + '\'');
        } else {
            System.out.println("Collection has contains " + count + " book(s) by author's name" + '\'' + name + '\'');
        }
    }

    //b) список книг, выпущенных заданным издательством;
    public void getBooksByPublishing(String publisher) {
        int count = 0;
        for (Book book : books) {
            if (book.getPublishingHouse().contains(publisher)) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Collection has not contains any book by publisher" + '\'' + publisher + '\'');
        } else {
            System.out.println("Collection has contains " + count + " book(s) by publisher" + '\'' + publisher + '\'');
        }
    }

    //c) список книг, выпущенных после заданного года.
    public void getBooksPublishedAfterGivenYear(int yearOfPublished) {
        int count = 0;
        if (yearOfPublished < 1900 | yearOfPublished > 2019) {
            System.out.println("Given year is incorrect!");
        } else {
            for (Book book : books) {
                if (book.getYearOfPublishing() >= yearOfPublished) {
                    System.out.println(book.getTitle() + " - " + book.getAuthor() + ", " + book.getYearOfPublishing());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Collection has not contains any book after " + '\'' + yearOfPublished + '\'' + " year.");
            } else {
                System.out.println("Collection has contains " + count + " book(s) after" + '\'' + yearOfPublished + '\'' + "year.");
            }
        }
    }

    public void print() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
