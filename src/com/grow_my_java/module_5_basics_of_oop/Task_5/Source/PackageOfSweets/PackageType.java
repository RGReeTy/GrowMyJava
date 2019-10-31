package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets;

public enum PackageType {
    BOX("Box"),
    PACKET("Packet");

    private String name;

    PackageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
