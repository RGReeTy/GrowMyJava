package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

public class Car {

    private String carModel;
    private String wheels;
    private String engine;

    public Car(String carModel, String wheels, String engine) {
        this.carModel = carModel;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void startMoving(String carModel) {
        System.out.println("The car " + carModel + " is starting moving!");
    }

    public void refuel() {
        System.out.println("The car is refueled!");
    }

    public void whatTheModel() {
        System.out.println("The model of car is " + getCarModel());
    }

    @Override
    public String toString() {
        return "Car " + carModel + '\'' +
                " has 4 wheels and powerful engine";
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
