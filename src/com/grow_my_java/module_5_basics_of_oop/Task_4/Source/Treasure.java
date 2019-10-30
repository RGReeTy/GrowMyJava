package com.grow_my_java.module_5_basics_of_oop.Task_4.Source;

public class Treasure {

    private static int genId = 1;
    private int id;
    private String typeOfTreasure;
    private String descriptionOfTreasure;
    private double count;

    public Treasure(String typeOfTreasure, String descriptionOfTreasure, double count) {
        this.id = genId++;
        this.typeOfTreasure = typeOfTreasure;
        this.descriptionOfTreasure = descriptionOfTreasure;
        this.count = count;
    }

    public String getTypeOfTreasure() {
        return typeOfTreasure;
    }

    public void setTypeOfTreasure(String typeOfTreasure) {
        this.typeOfTreasure = typeOfTreasure;
    }

    public int getId() {
        return id;
    }
    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        if (count > 0) {
            this.count = count;
        } else {
            System.err.println("Write a real count of treasure");
        }
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "typeOfTreasure='" + typeOfTreasure + '\'' +
                ", descriptionOfTreasure='" + descriptionOfTreasure + '\'' +
                ", count=" + count +
                '}';
    }
}
