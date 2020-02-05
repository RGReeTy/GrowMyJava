package com.grow_my_java.differrent_tests.other;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Tetstssyufkfl implements Runnable {
    String a, b;

    public static void main(String[] args) {
        Tetstssyufkfl run = new Tetstssyufkfl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (this) {
                a = "A";
                b = "B";
            }
            System.out.println(a + b + " ");
        }
    }

}
