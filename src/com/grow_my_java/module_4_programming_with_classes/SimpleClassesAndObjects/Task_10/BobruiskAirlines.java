package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_10;

import java.time.LocalTime;

public class BobruiskAirlines {
    ////10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //    //и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
    //    //методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //    //Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    //    //Найти и вывести:
    //    //a) список рейсов для заданного пункта назначения;
    //    //b) список рейсов для заданного дня недели;
    //    //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

    public static void main(String[] args) {

        Airline[] airlines = {
                new Airline("Boston", 4242, "Airbus", LocalTime.of(14, 40), 3),
                new Airline("Miami", 1534, "Airbus", LocalTime.of(2, 15), 1),
                new Airline("Miami", 1535, "Airbus", LocalTime.of(12, 15), 5),
                new Airline("Cherepovetz", 1001, "Boeing", LocalTime.of(22, 59), 7),
        };

        System.out.println("------------------------------------");

        //a) список рейсов для заданного пункта назначения;
        getFlightToDestination(airlines, "Miami");
        System.out.println("------------------------------------");

        //b) список рейсов для заданного дня недели;
        getFlightAtCertainDay(airlines, 4);
        System.out.println("------------------------------------");
        getFlightAtCertainDay(airlines, 7);
        System.out.println("------------------------------------");

        //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
        getFlightAtCertainDayAndAfterCertainTime(airlines, 2, LocalTime.of(14, 00));
        System.out.println("------------------------------------");
    }

    private static void getFlightAtCertainDayAndAfterCertainTime(Airline[] airlines, int day, LocalTime time) {
        boolean isCorrect = false;
        for (Airline flight : airlines) {
            if (flight.getDayOfWeek() == day) {
                if (time.isBefore(flight.getLocalTime())) {
                    flight.print();
                    isCorrect = true;
                }
            }
        }
        if (!isCorrect) {
            System.out.println("Sorry, we havn't any flight at " + DaysOfWeek.getDay(day) + " after " + time + "!!");
        }
    }

    private static void getFlightAtCertainDay(Airline[] airlines, int day) {
        boolean isCorrect = false;
        for (Airline flight : airlines) {
            if (flight.getDayOfWeek() == day) {
                flight.print();
                isCorrect = true;
            }
        }
        if (!isCorrect) {
            System.out.println("Sorry, we havn't any flight at " + DaysOfWeek.getDay(day) + "!!");
        }
    }

    private static void getFlightToDestination(Airline[] airlines, String destination) {
        boolean isCorrect = false;
        for (Airline flight : airlines) {
            if (flight.getPointOfDestination().contains(destination)) {
                flight.print();
                isCorrect = true;
            }
        }
        if (!isCorrect) {
            System.out.println("Sorry, we havn't any flight to " + destination);
        }
    }
}