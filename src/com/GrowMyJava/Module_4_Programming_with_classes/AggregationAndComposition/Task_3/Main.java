package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

public class Main {
    //3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
    //столицу, количество областей, площадь, областные центры.

    public static void main(String[] args) {

        Logic logic = new Logic();

        City Bobruisk = new City("Bobruisk", 350000);
        logic.printCityInfo(Bobruisk);
    }

}
