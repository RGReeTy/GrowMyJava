package com.grow_my_java.module_5_basics_of_oop.Task_4.Source;

public class Treasure {

    private String nameOfTreasure;
    private String descriptionOfTreasure;
    private double count;

    public Treasure(String nameOfTreasure, String descriptionOfTreasure, double count) {
        this.nameOfTreasure = nameOfTreasure;
        this.descriptionOfTreasure = descriptionOfTreasure;
        this.count = count;
    }

    public String getNameOfTreasure() {
        return nameOfTreasure;
    }

    public void setNameOfTreasure(String nameOfTreasure) {
        this.nameOfTreasure = nameOfTreasure;
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


}
