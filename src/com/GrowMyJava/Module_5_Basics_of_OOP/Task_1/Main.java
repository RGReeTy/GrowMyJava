package com.GrowMyJava.Module_5_Basics_of_OOP.Task_1;

import com.GrowMyJava.Module_5_Basics_of_OOP.Task_1.source.*;

public class Main {
    //1. Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    //вывести на консоль содержимое, дополнить, удалить.

    public static void main(String[] args) {
        DirectoryLogic directoryUtils = new DirectoryLogic(new Directory("Books"));

        File book1 = new TextFile("Play to live.");
        File book2 = new TextFile("Learning Java.");
        File book3 = new TextFile("Algorithms.");
        File book4 = new TextFile("Learning SQL.");
        File book5 = new TextFile("Hobbit.");

        directoryUtils.addFile(book1);
        directoryUtils.addFile(book2);
        directoryUtils.addFile(book3);
        directoryUtils.addFile(book4);
        directoryUtils.addFile(book5);

        directoryUtils.printFiles();

        System.out.println(book1.getCreated());

        book1.read();
        System.out.println(book1.getOpened());

        book1.printContent();

        book1.addContent("Hello");
        System.out.println(book1.getModified());

        book1.getSize();

        book1.printContent();
    }
}