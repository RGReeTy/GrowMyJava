package com.grow_my_java.module_6.Task_1.utils;

public enum Operation {
    ADDED,
    REMOVED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
