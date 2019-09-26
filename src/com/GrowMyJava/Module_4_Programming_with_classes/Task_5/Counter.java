package com.GrowMyJava.Module_4_Programming_with_classes.Task_5;

public class Counter {
    //5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    //на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    //произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    //позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

    private int counter; //set range from 0 to 99

    Counter() {
        counter = 0;
    }

    Counter(int counter) {
        if (counter >= 0 & counter < 99) {
            this.counter = counter;
        } else {
            this.counter = 0;
        }
    }

    int getRandomCounter() {
        return counter = (int) Math.abs(Math.random() * 100);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    void counterIncrease() {
        if (counter >= 0 & counter < 99) {
            counter++;
        }
    }

    void counterDecrease() {
        if (counter > 0 & counter <= 99) {
            counter--;
        }
    }

    @Override
    public String toString() {
        return " " + counter;
    }
}
