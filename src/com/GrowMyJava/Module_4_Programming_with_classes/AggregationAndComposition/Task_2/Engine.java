package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

public class Engine {

    private int powerOfEngine;
    private double valueOfEngine;

    public Engine(int powerOfEngine, double valueOfEngine) {
        this.powerOfEngine = powerOfEngine;
        this.valueOfEngine = valueOfEngine;
    }

    public Engine() {
        this.powerOfEngine = 75;
        this.valueOfEngine = 1.8;
    }

    public void printEngine() {
        System.out.println("Engine has " + powerOfEngine +
                " of horsepower, value of engine = " + valueOfEngine);
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public double getValueOfEngine() {
        return valueOfEngine;
    }

    public void setValueOfEngine(double valueOfEngine) {
        this.valueOfEngine = valueOfEngine;
    }
}
