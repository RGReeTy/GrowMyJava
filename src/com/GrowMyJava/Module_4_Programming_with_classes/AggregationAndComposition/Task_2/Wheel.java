package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

public class Wheel {

    private int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public Wheel() {
        this.diameter = 14;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void printWheel() {
        System.out.println("Wheels has " + diameter + " inches.");
    }
}
