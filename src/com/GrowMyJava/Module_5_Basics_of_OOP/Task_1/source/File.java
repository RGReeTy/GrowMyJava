package com.GrowMyJava.Module_5_Basics_of_OOP.Task_1.source;

import java.time.LocalDateTime;

public abstract class File {

    private String nameOfFile;
    private boolean isReadable = false;
    private boolean isWritable = false;
    private int size;
    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime opened;

    public File(String nameOfFile) {
        this.nameOfFile = nameOfFile;
        this.isReadable = true;
        this.isWritable = true;
        this.size = 0;
        this.created = LocalDateTime.now();
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public boolean isReadable() {
        return isReadable;
    }

    public void setReadable(boolean readable) {
        isReadable = readable;
    }

    public boolean isWritable() {
        return isWritable;
    }

    public void setWritable(boolean writable) {
        isWritable = writable;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public LocalDateTime getOpened() {
        return opened;
    }

    public void setOpened(LocalDateTime opened) {
        this.opened = opened;
    }

    public abstract void read();

    public abstract void printContent();

    public abstract int getSize();

    public abstract void addContent(String content);

    @Override
    public String toString() {
        return nameOfFile;
    }
}
