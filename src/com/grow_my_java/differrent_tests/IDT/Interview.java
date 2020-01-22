package com.grow_my_java.differrent_tests.IDT;

//17.01.2020 14:00

import java.util.stream.IntStream;

public class Interview {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + i * j);
                System.out.print("\t");
            }
            System.out.println();
        }


        IntStream.of(10, 11, 12).filter(x -> x < 12).map(x -> x * 10).forEach(System.out::println);
    }


}
