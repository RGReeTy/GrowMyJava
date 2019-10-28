package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_5.Logic;

public class Client {
    private static int genId = 1;
    private int id;
    private String name;
    private String lastname;

    public Client(String name, String lastname) {
        this.id = genId++;
        this.name = name;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("#%d\t %s, %s\t", id, lastname, name);
    }
}
