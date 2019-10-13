package com.GrowMyJava.Module_4_Programming_with_classes.SimpleClassesAndObjects.Task_4;

import java.time.LocalTime;

public class Train {
    //4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    //Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    //номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    //Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
    //назначения должны быть упорядочены по времени отправления.

    private String pointOfDestination;
    private int trainID;
    private LocalTime localTime;

    Train(String pointOfDestination, int trainID, LocalTime localTime) {
        this.pointOfDestination = pointOfDestination;
        this.trainID = trainID;
        this.localTime = localTime;
    }

    public String getPointOfDestination() {
        return pointOfDestination;
    }

    public void setPointOfDestination(String pointOfDestination) {
        this.pointOfDestination = pointOfDestination;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public void print() {
        System.out.println("Train №" + trainID + " to " + pointOfDestination + " departure at " + localTime);
    }
}
