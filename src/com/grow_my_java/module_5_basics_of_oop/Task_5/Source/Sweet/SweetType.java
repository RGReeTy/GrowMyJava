package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet;

public enum SweetType {
    CHOCOLATE("Chocolate"),
    COOKIES("Cookies"),
    CANDY("Candy");

    private String name;

    SweetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
