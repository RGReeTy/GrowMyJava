package com.GrowMyJava.Module_4_Programming_with_classes.Task_10;

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

    @Override
    public String toString() {
        String getDay = DaysOfWeek.getDay(dayOfWeek).toLowerCase();
        return "Flight: " +
                "pointOfDestination='" + pointOfDestination + '\'' +
                ", flightID=" + flightID +
                ", typeOfAirplane='" + typeOfAirplane + '\'' +
                ", localTime=" + localTime +
                ", dayOfWeek=" + getDay;
    }
}
