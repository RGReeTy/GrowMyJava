package com.GrowMyJava.Module_5_Basics_of_OOP.Task_1.source;

public class File {

    private String nameOfFile;

    public File(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    @Override
    public String toString() {
        return "File{" +
                "nameOfFile='" + nameOfFile + '\'' +
                '}';
    }
}
