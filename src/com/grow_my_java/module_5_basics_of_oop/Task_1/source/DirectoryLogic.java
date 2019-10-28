package com.grow_my_java.module_5_basics_of_oop.Task_1.source;

public class DirectoryLogic {

    private Directory directory;

    public DirectoryLogic(Directory directory) {
        this.directory = directory;
    }

    public boolean addFile(File file) {
        return directory.getFiles().add(file);
    }

    public boolean deleteFile(File file) {
        return directory.getFiles().remove(file);
    }

    public void printFiles() {
        if (directory.getFiles().isEmpty()) {
            System.out.println("The directory is empty!");
            return;
        }

        for (File file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}
