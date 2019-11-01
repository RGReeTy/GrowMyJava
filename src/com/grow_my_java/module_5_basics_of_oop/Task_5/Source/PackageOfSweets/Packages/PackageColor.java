package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages;

public enum PackageColor {
    RED("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    WHITE("White"),
    PURPLE("Purple"),
    ORANGE("Orange"),
    GOLDEN("Golden"),
    CORAL("Coral"),
    CYAN("Cyan"),
    PINK("Pink");

    private String name;

    PackageColor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
