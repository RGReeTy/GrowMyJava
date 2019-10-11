package com.GrowMyJava.Module_4_Programming_with_classes.SimpleClassesAndObjects.Task_6;


public class Work_with_Time {
    //6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    //изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    //недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
    //заданное количество часов, минут и секунд.

    private int hour;
    private int minutes;
    private int seconds;

    public Work_with_Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Work_with_Time() {
        this.hour = 00;
        this.minutes = 00;
        this.seconds = 00;
    }

    @Override
    public String toString() {
        //return "Time " + "hour=" + hour + ", minutes=" + minutes + ", seconds=" + seconds;
        return hour + ":" + minutes + ":" + seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void addHours(int added_hours) {
        if (added_hours < 0) {
            System.out.println("Mistake!");
        } else {
            while (added_hours > 23) {
                added_hours -= 24;
            }
            if (this.hour + added_hours > 24) {
                setHour(this.hour + added_hours - 24);
            } else {
                setHour(this.hour + added_hours);
            }
        }
    }

    public void addMinutes(int added_minutes) {
        if (added_minutes < 0) {
            System.out.println("Mistake!");
        } else {
            int counter = 0;
            while (added_minutes > 59) {
                counter++;
                added_minutes -= 60;
            }
            addHours(counter);
            if (this.minutes + added_minutes > 59) {
                setMinutes(this.minutes + added_minutes - 60);
            } else {
                setMinutes(this.minutes + added_minutes);
            }
        }
    }

    public void addSeconds(int added_seconds) {
        if (added_seconds < 0) {
            System.out.println("Mistake!");
        } else {
            int counter = 0;
            while (added_seconds > 59) {
                counter++;
                added_seconds -= 60;
            }
            addMinutes(counter);
            if (this.seconds + added_seconds > 59) {
                setSeconds(this.seconds + added_seconds - 60);
            } else {
                setSeconds(this.seconds + added_seconds);
            }
        }
    }
}