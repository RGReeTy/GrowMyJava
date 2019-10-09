package com.GrowMyJava.Module_4_Programming_with_classes.Task_10;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    private String getDay;

    DaysOfWeek(String getDay) {
        this.getDay = getDay;
    }

    DaysOfWeek() {
    }

    public static String getDay(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return MONDAY.toString();
            case 2:
                return TUESDAY.toString();
            case 3:
                return WEDNESDAY.toString();
            case 4:
                return THURSDAY.toString();
            case 5:
                return FRIDAY.toString();
            case 6:
                return SATURDAY.toString();
            case 7:
                return SUNDAY.toString();
        }
        return "Write day 1-7!";
    }

    public String getGetDay() {
        return getDay;
    }

//    public String getDayOfWeek(int numberOfDay){
//        switch (numberOfDay){
//            case 1: return MONDAY.toString();
//            case 2: return TUESDAY.toString();
//            case 3: return WEDNESDAY.toString();
//            case 4: return THURSDAY.toString();
//            case 5: return FRIDAY.toString();
//            case 6: return SATURDAY.toString();
//            case 7: return SUNDAY.toString();
//            }
//        return null;
//    }
}
