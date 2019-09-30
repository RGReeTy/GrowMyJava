package com.GrowMyJava.Module_4_Programming_with_classes.Task_6;

public class Task_6 {
    //6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    //изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    //недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
    //заданное количество часов, минут и секунд.

    public static void main(String[] args) {

        Work_with_Time date = new Work_with_Time();
        System.out.println(date.toString());
        //----------------------------------------------------------------------
        date.setHour(15);
        date.setMinutes(75);
        date.setSeconds(-15);
        System.out.println(date.toString());
        //----------------------------------------------------------------------
        date.addHours(-16);
        System.out.println(date.toString());
        date.addHours(1);
        System.out.println(date.toString());
        date.addHours(50);
        System.out.println(date.toString());
        //----------------------------------------------------------------------
        date.addMinutes(-10);
        System.out.println(date.toString());
        date.addMinutes(1);
        System.out.println(date.toString());
        date.addMinutes(555);
        System.out.println(date.toString());
        //----------------------------------------------------------------------
        date.addSeconds(-16);
        System.out.println(date.toString());
        date.addSeconds(1);
        System.out.println(date.toString());
        date.addSeconds(7777);
        System.out.println(date.toString());
    }
}
