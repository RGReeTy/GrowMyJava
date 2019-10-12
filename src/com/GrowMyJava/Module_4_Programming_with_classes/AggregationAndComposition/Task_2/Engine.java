package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

public class Engine {

    private String engine;

    @Override
    public String toString() {
        return "Engine{" +
                "engine='" + engine + '\'' +
                '}';
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
