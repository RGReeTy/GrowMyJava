package com.GrowMyJava.Module_5_Basics_of_OOP.Task_1.source;

import java.time.LocalDateTime;

public class TextFile extends File {

    private Text content;

    public TextFile(String name) {
        super(name);
        content = new Text("");
    }

    @Override
    public void read() {
        if (isReadable()) {
            System.out.println("Text file is opened!");
            setOpened(LocalDateTime.now());
        } else {
            System.out.println("Cannot read the file!");
        }
    }

    @Override
    public void printContent() {
        if (isReadable()) {
            System.out.println("Content: " + content.getContent());
        } else {
            System.out.println("Cannot print the file!");
        }
    }

    @Override
    public int getSize() {
        int size = content.getContent().getBytes().length;
        System.out.println("The text file size = " + size + " bytes");
        return size;
    }

    public void addContent(String content) {
        if (isWritable()) {
            this.content.addContent(content);
            setModified(LocalDateTime.now());
            System.out.println("The file was modified!");
        } else {
            System.out.println("Can't write the file!");
        }
    }
}