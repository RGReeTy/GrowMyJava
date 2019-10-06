package com.GrowMyJava.Module_4_Programming_with_classes.Task_9;

import java.util.ArrayList;
import java.util.Set;

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

    public void booksByAuthor(String name) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().contains(name)) {
                System.out.println(book.getTitle());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Collection has not contains any book by author's name" + '\'' + name + '\'');
        } else {
            System.out.println("Collection has contains " + count + " book(s) by author's name" + '\'' + name + '\'');
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
