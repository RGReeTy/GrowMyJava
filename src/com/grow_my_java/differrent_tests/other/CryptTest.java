package com.grow_my_java.differrent_tests.other;

public class CryptTest {
    public static void main(String[] args) {

        String test = "1234";
        String cryptedWord = "";
        char[] symb = test.toCharArray();
        for (char ch : symb) {
            cryptedWord += (ch + 13);
        }

        System.out.println(cryptedWord);

    }
}
