package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects;

public class Task_2 {
    //2. Создйте класс Test2 (пусть будет Task_2) двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
    //конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
    //класса.

    int number_one;
    int number_two;

    public Task_2() {
        int number_one = 1;
        int number_two = 2;
    }

    public Task_2(int number_one, int number_two) {
        this.number_one = number_one;
        this.number_two = number_two;
    }

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
}
