package com.grow_my_java.module_6.Task_1;

import com.grow_my_java.module_6.Task_1.source.book.*;
import com.grow_my_java.module_6.Task_1.source.user.*;
import com.grow_my_java.module_6.Task_1.utils.*;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = Catalog.getCatalog("adminushka", "admin");

        Pagination<Book> catalogBooks = new Pagination<>(catalog.getBooks());
        catalogBooks.nextPage();
        catalogBooks.nextPage();
        catalogBooks.previousPage();

        Book book = new BookBuilder().withTitle("Java")
                .withAuthors(new String[]{"Bloch"})
                .setPublisher("Ascona")
                .setYear(2010)
                .setPageNum(750)
                .setType(Type.E_BOOK)
                .build();

        catalog.addBook(book);
        catalog.removeBook(book);

        User user = new User("seeker", "seeker");

        catalog.setUser(user);

        System.out.println("=================================");
        Pagination<Book> searchBook1 = new Pagination<>(catalog.findBooksByAuthor("Lewis Carroll"));
        searchBook1.nextPage();

        System.out.println("=================================");
        Pagination<Book> searchBook2 = new Pagination<>(catalog.findBooksByTitle("Dogsbody"));
        searchBook2.nextPage();

        System.out.println("=================================");

        Book book2 = new BookBuilder().withTitle("C++")
                .withAuthors(new String[]{"NotBloch"})
                .setPublisher("North Star")
                .setYear(2001)
                .setPageNum(820)
                .setType(Type.PAPER)
                .build();

        catalog.sendBookToCatalog("Add this book, please!", "It's a very helpful book", (Content) book2);

        catalog.getUser().getEmail().printInbox();
        catalog.getUser().getEmail().printOutbox();

        UserUtils.addUser("reader", "reader");

        UserUtils.removeUser("reader", "reader");

    }
}
