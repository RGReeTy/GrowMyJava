package com.GrowMyJava.Module_4_Programming_with_classes;

public class Task_1 {
    //1. Создайте класс Test1 (пусть будет Task_1) с двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    //переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    //наибольшее значение из этих двух переменных.
    int number_one;
    int number_two;

    public int getNumber_one() {
        return number_one;
    }

    public void setNumber_one(int number_one) {
        this.number_one = number_one;
    }

    public int getNumber_two() {
        return number_two;
    }

    public void setNumber_two(int number_two) {
        this.number_two = number_two;
    }

    public void printToConsole(int number) {
        System.out.println(number);
    }

    public void printToConsole(int number_one, int number_two) {
        System.out.println("" + number_one + number_two);
    }

    public void sum(int number_one, int number_two) {
        System.out.println(number_one + number_two);
    }

    public void find_max(int number_one, int number_two) {
        if (number_one != number_two) {
            int largerNum = number_one > number_two ? number_one : number_two;
            System.out.println("Maximal number is " + largerNum);
        } else {
            System.out.println("numbers are equal");
        }
    }
}
