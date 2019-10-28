package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

public class Task_1_3 {
    //3. В строке найти количество цифр.
    public static void main(String[] args) {
        String testLine = "I w3445ant't 2345to write0 any5 wo7rd. This67567 is st546rong 67658ord. Wo6rd wor6d wOR3D3 W8ORD wor8ds00.";

        //1st не работает как задумывалось, разбивает на группы
        String[] s = testLine.split("\\D+");
        System.out.println(s.length);

        //2nd
        int length = testLine.length() - testLine.replaceAll("\\d+", "").length();
        System.out.println("Digits at line: " + length);
        //3rd
        System.out.println("Digits at line: " + getCountOfDigits(testLine));
    }

    //3rd
    private static int getCountOfDigits(String testLine) {
        int count = 0;
        for (int i = 0; i < testLine.length(); i++) {
            if (Character.isDigit(testLine.charAt(i))) count++;
        }
        return count;
    }
}

