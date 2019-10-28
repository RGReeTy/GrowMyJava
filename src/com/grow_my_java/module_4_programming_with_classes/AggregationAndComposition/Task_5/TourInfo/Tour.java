package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_5.TourInfo;

import java.time.Period;

public class Tour {
    private static int genId = 1;
    private int id;
    private String name;
    private String description;
    private TypeOfTour typeOfTour;
    private Transport transport;
    private Food food;
    private Period duration;
    private double price;

    public Tour(String name, String description, TypeOfTour typeOfTour, Transport transport,
                Food food, Period duration, double price) {
        this.id = genId++;
        this.name = name;
        this.description = description;
        this.typeOfTour = typeOfTour;
        this.transport = transport;
        this.food = food;
        this.duration = duration;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeOfTour getTypeOfTour() {
        return typeOfTour;
    }

    public void setTypeOfTour(TypeOfTour typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Period getDuration() {
        return duration;
    }

    public void setDuration(Period duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d,\t name: %s,\t destination: %s,\t typeOfTour: %s,\t transport: %s,\t food: %s,\t" +
                " duration: %d,\t price: %.2f", id, name, description, typeOfTour, transport, food, duration.getDays(), price);
    }
}
