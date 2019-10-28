package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_6;

public class Task_6 {
    //6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    //изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    //недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
    //заданное количество часов, минут и секунд.

    public static void main(String[] args) {

        Work_with_Time date = new Work_with_Time();
        date.printTime();
        //----------------------------------------------------------------------
        date.setHour(15);
        date.setMinutes(75);
        date.setSeconds(-15);
        date.printTime();
        //----------------------------------------------------------------------
        date.addHours(-16);
        date.printTime();
        date.addHours(1);
        date.printTime();
        date.addHours(50);
        date.printTime();
        //----------------------------------------------------------------------
        date.addMinutes(-10);
        date.printTime();
        date.addMinutes(1);
        date.printTime();
        date.addMinutes(555);
        date.printTime();
        //----------------------------------------------------------------------
        date.addSeconds(-16);
        date.printTime();
        date.addSeconds(1);
        date.printTime();
        date.addSeconds(7777);
        date.printTime();
    }
}
