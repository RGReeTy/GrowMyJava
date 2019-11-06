package com.grow_my_java.module_6.task01.utils;

public enum Operation {
    ADDED,
    REMOVED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
