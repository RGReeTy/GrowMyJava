package com.GrowMyJava.Module_4_Programming_with_classes.Task_5;

public class Counter {
    //5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    //на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    //произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    //позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

    private int counter; //set diapazon


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int counterIncrease(int value) {
        return value + 1;
    }
}
