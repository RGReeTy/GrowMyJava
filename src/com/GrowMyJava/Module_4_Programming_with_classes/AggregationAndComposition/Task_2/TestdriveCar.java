package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

import java.util.ArrayList;
import java.util.List;

public class TestdriveCar {
    //2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    //менять колесо, вывести на консоль марку автомобиля.

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>() {
            Car boomer = new Car("BMW", "wheels", "engine 2.5");
            Car mercedes = new Car("Mercedes", "wheels", "engine 2.2");
            Car yabidabidoo = new Car("yabidabidoo", "none", "none");
        };

        for (Car car : cars) {
            car.whatTheModel();
        }

        for (Car car : cars) {
            car.startMoving(car.getCarModel());
        }


    }
}
