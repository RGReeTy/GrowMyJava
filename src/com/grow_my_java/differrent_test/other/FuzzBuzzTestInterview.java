package com.grow_my_java.differrent_test.other;

public class FuzzBuzzTestInterview {
    //Вывести числа от 0 до 100. Если число делится на 3, то должно быть написано Fuzz, если делится на 5 - Buzz. Если
    // делится и на 3 и на 5 - FuzzBuzz.
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println("FuzzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
