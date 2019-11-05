package com.grow_my_java.module_6.Task_1.source;

import com.grow_my_java.module_6.Task_1.source.book.Book;
import com.grow_my_java.module_6.Task_1.source.user.Email;
import com.grow_my_java.module_6.Task_1.utils.Operation;

public interface CatalogObserver {

    void update(Operation operation, Book book, Email email);
}
