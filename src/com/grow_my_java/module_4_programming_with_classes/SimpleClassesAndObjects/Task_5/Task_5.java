package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_5;

import java.util.Scanner;

public class Task_5 {
    //5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    //на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    //произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    //позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Counter c_1 = new Counter();
        Counter c_2 = new Counter(45);
        Counter c_3 = new Counter(555);
        Counter c_4 = new Counter();
        //------------------------------------------
        c_4.getRandomCounter();
        //------------------------------------------
        System.out.println("Counters: " + "c_1 = {" + c_1 + " } " + "c_2 = {" + c_2 + " } " + "c_3 = {" + c_3 + " } " + "c_4 = {" + c_4 + " }");
        //------------------------------------------
        c_1.counterIncrease();
        c_2.counterIncrease();
        c_3.counterIncrease();
        c_4.counterIncrease();
        System.out.println("Counters: " + "c_1 = {" + c_1 + " } " + "c_2 = {" + c_2 + " } " + "c_3 = {" + c_3 + " } " + "c_4 = {" + c_4 + " }");
        //------------------------------------------
        c_1.counterDecrease();
        c_2.counterDecrease();
        c_3.counterDecrease();
        c_4.counterDecrease();
        System.out.println("Counters: " + "c_1 = {" + c_1 + " } " + "c_2 = {" + c_2 + " } " + "c_3 = {" + c_3 + " } " + "c_4 = {" + c_4 + " }");


    }
}
