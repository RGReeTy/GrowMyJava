package com.grow_my_java.module_5_basics_of_oop.Task_3;

import com.grow_my_java.module_5_basics_of_oop.Task_3.Source.Calendar;

public class Main {
    //3. Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
    //выходных и праздничных днях.
    public static void main(String[] args) {

        Calendar calendar = new Calendar(2019);

        calendar.addHoliday(1999, 10, 1);
        calendar.addHoliday(2003, 1, 12);

        calendar.getAllHolidays();

        calendar.printHolidays();
    }
}
