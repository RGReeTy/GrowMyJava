package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

public class Wheel {

    private String wheel_front_left;
    private String wheel_front_right;
    private String wheel_back_left;
    private String wheel_back_right;

    public Wheel(String wheel_front_left, String wheel_front_right, String wheel_back_left, String wheel_back_right) {
        this.wheel_front_left = wheel_front_left;
        this.wheel_front_right = wheel_front_right;
        this.wheel_back_left = wheel_back_left;
        this.wheel_back_right = wheel_back_right;
    }

    public Wheel() {
    }

    public void changeTheWheel(String wheel) {
        System.out.println("The wheel is changed!");
    }

    @Override
    public String toString() {
        return "You have 4 wheels";
    }

    public String getWheel_front_left() {
        return wheel_front_left;
    }

    public void setWheel_front_left(String wheel_front_left) {
        this.wheel_front_left = wheel_front_left;
    }

    public String getWheel_front_right() {
        return wheel_front_right;
    }

    public void setWheel_front_right(String wheel_front_right) {
        this.wheel_front_right = wheel_front_right;
    }

    public String getWheel_back_left() {
        return wheel_back_left;
    }

    public void setWheel_back_left(String wheel_back_left) {
        this.wheel_back_left = wheel_back_left;
    }

    public String getWheel_back_right() {
        return wheel_back_right;
    }

    public void setWheel_back_right(String wheel_back_right) {
        this.wheel_back_right = wheel_back_right;
    }
}
