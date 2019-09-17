package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

public class Task_1_4 {
    //4. В строке найти количество чисел.
    public static void main(String[] args) {
        String testLine1 = "I w3445ant't 2345to write0 any5 wo7rd. This67567 is st546rong 67658ord. Wo6rd wor6d wOR3D3 W8ORD wor8ds00.";
        String testLine2 = "44 fafsaf 55 fasf896 fasfasf1 saf as23";
        String[] s1 = testLine1.split("\\D+");
        System.out.println(s1.length);
        String[] s2 = testLine2.split("\\D+");
        System.out.println(s2.length);
    }
}

