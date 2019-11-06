package com.grow_my_java.module_6.task01.entity;

import com.grow_my_java.module_6.task01.entity.book.Book;
import com.grow_my_java.module_6.task01.entity.user.Email;
import com.grow_my_java.module_6.task01.utils.Operation;

public interface CatalogObserver {

    void update(Operation operation, Book book, Email email);
}
