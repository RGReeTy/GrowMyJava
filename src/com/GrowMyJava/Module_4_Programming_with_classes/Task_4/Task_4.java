package com.GrowMyJava.Module_4_Programming_with_classes.Task_4;

import java.time.LocalTime;
import java.util.Scanner;

public class Task_4 {
    //4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    //Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    //номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    //Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
    //назначения должны быть упорядочены по времени отправления.

    public static void main(String[] args) {

        Train[] trains = {
                new Train("Amsterdam", 204, LocalTime.of(22, 00)),
                new Train("Haarlem", 201, LocalTime.of(10, 00)),
                new Train("Dusseldorf", 203, LocalTime.of(17, 40)),
                new Train("Brugge", 202, LocalTime.of(3, 30)),
                new Train("Amsterdam", 205, LocalTime.of(12, 00))
        };

        System.out.println("The sorted list by ID of available trains: ");
        printAllTrains(sortTrainsByTrainID(trains));

        System.out.println("\nThe sorted list by point of destination of available trains: ");
        printAllTrains(sortTrainsByPointOfDestination(trains));

        System.out.println("Available train ID are: ");
        getAvailableTrainID(trains);
        System.out.println("\nPlease enter the number of train for more information..\n");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        getTrainByNumber(trains, number);
    }

    private static Train[] sortTrainsByTrainID(Train[] trains) {
        for (int i = 0; i < trains.length - 1; i++) {
            int temp_min_number = i;
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[j].getTrainID() < trains[temp_min_number].getTrainID()) {
                    temp_min_number = j;
                }
            }
            Train temp = trains[temp_min_number];
            trains[temp_min_number] = trains[i];
            trains[i] = temp;
        }
        return trains;
        //printAllTrains(trains);
    }

    private static Train[] sortTrainsByPointOfDestination(Train[] trains) {
        for (int i = 0; i < trains.length - 1; i++) {
            int temp_pod = i;
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[j].getPointOfDestination().compareToIgnoreCase(trains[temp_pod].getPointOfDestination()) < 0) {
                    temp_pod = j;
                } else if (trains[j].getPointOfDestination().compareToIgnoreCase(trains[temp_pod].getPointOfDestination()) == 0) {
                    if (trains[j].getLocalTime().compareTo(trains[temp_pod].getLocalTime()) < 0) {
                        Train temp = trains[temp_pod];
                        trains[temp_pod] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
            Train temp = trains[temp_pod];
            trains[temp_pod] = trains[i];
            trains[i] = temp;
        }
        return trains;
        //printAllTrains(trains);
    }

    private static void printAllTrains(Train[] trains) {
        for (Train train : trains) System.out.println(train.toString());
    }

    private static void getAvailableTrainID(Train[] trains) {
        for (Train train : trains) {
            System.out.print(train.getTrainID() + " ");
        }
    }

    private static void getTrainByNumber(Train[] trains, int number) {
        for (Train train : trains) {
            if (number == train.getTrainID()) System.out.println(train);
        }
    }
}
