package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_2;

import java.util.ArrayList;
import java.util.List;

public class TestdriveCar {
    //2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    //менять колесо, вывести на консоль марку автомобиля.

    public static void main(String[] args) {

        Engine engine = new Engine(555, 6.2);

        Car car = new Car("Shelby GT500", engine);

        car.addWheel(new Wheel(15));
        car.addWheel(new Wheel(15));
        car.addWheel(new Wheel(15));
        car.addWheel(new Wheel(15));

        car.printModel();

        car.fuelUp();
        car.changeWheel();
        car.move();

        car.changeWheel();

    }

}

