package com.grow_my_java.module_5_basics_of_oop.Task_1.source;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String nameOfDirectory;
    private List<File> fileList;

    public Directory(String nameOfDirectory) {
        this.nameOfDirectory = nameOfDirectory;
        fileList = new ArrayList<>();
    }

    public String getName() {
        return nameOfDirectory;
    }

    public void setName(String nameOfDirectory) {
        this.nameOfDirectory = nameOfDirectory;
    }


    public List<File> getFiles() {
        return fileList;
    }

    @Override
    public String toString() {
        return "Directory{" + "nameOfDirectory='" + nameOfDirectory + '\'' + '}';
    }
}
