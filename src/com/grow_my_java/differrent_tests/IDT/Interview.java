package com.grow_my_java.differrent_tests.IDT;

//17.01.2020 14:00

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Interview {

    public static void main(String[] args) {

        //version 1 (starting from 1, columns at one line)
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");

        //version 2 (starting from 2, columns at two lines)
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");

        //version 3 with using 'while' loop (starting from 2, columns at one line)
        int x = 1, y = 2;
        while (x != 10) {
            while (y != 10) {
                System.out.print(y + " x " + x + " = " + y * x + "\t");
                y++;
            }
            System.out.println();
            x++;
            y = 2;
        }
        System.out.println("----------------------------------------------------------------");

        //version 4 with using StreamAPI
        //Stream.of(2, 3, 4, 5, 6, 7, 8, 9).
        Stream<Integer> stream = Stream.of(2, 3, 4, 5, 6, 7, 8, 9);
        IntStream.range(1, 10)
                .forEach(elem -> IntStream.range(1, 10)
                        .forEach(el -> System.out.format("%s * %s = %s\t", el, elem, (el * elem))));

        //stream.iterator(IntStream.range(1, 10).peek(s -> System.out.print(s)).lforEach(System.out::println)));
        //IntStream stream1 = IntStream.range(1, 10).mapToObj(element -> IntStream.range(2, 10).peek(result -> String.format("%s x %s = %s", element, result, (element * result));
        //System.out.println(elem + " x " + (elem -1) + " = " + elem * (elem - 1) + "\t"))
        //.forEach(System.out::println);


        //stream.peek(s -> System.out.println(s + " x " + (s + 1) + " = " + s * (s + 1) + "\t"))
        //        .forEach(System.out::println);


    }

}
