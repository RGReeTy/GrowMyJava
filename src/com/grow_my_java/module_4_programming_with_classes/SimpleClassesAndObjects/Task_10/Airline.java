package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_10;

import java.time.LocalTime;


public class Airline {

    //10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    //Найти и вывести:
    //a) список рейсов для заданного пункта назначения;
    //b) список рейсов для заданного дня недели;
    //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

    private String pointOfDestination;
    private int flightID;
    private String typeOfAirplane;
    private LocalTime localTime;
    private int dayOfWeek;

    public Airline(String pointOfDestination, int flightID, String typeOfAirplane, LocalTime localTime, int dayOfWeek) {
        this.pointOfDestination = pointOfDestination;
        this.flightID = flightID;
        this.typeOfAirplane = typeOfAirplane;
        this.localTime = localTime;
        this.dayOfWeek = dayOfWeek;
    }

    public void print() {
        String getDay = DaysOfWeek.getDay(dayOfWeek).toLowerCase();
        System.out.println("Flight: " +
                "pointOfDestination='" + pointOfDestination + '\'' +
                ", flightID=" + flightID +
                ", typeOfAirplane='" + typeOfAirplane + '\'' +
                ", localTime=" + localTime +
                ", dayOfWeek=" + getDay);
    }

    public String getPointOfDestination() {
        return pointOfDestination;
    }

    public void setPointOfDestination(String pointOfDestination) {
        this.pointOfDestination = pointOfDestination;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getTypeOfAirplane() {
        return typeOfAirplane;
    }

    public void setTypeOfAirplane(String typeOfAirplane) {
        this.typeOfAirplane = typeOfAirplane;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        if (dayOfWeek >= 1 & dayOfWeek <= 7) {
            this.dayOfWeek = dayOfWeek;
        } else {
            System.out.println("Wrong day");
        }
    }
}
