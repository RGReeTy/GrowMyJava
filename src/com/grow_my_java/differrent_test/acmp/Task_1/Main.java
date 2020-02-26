package com.grow_my_java.differrent_test.acmp.Task_1;

import java.io.*;
import java.util.Scanner;

public class Main {

    Scanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        out.print(in.nextInt() + in.nextInt());
    }

    void run() {
        try {
            in = new Scanner(new FileReader("input.txt"));
            out = new PrintWriter(new FileWriter("output.txt"));
        } catch (IOException e) {
            throw new IOError(e);
        }
        try {
            solve();
        } finally {
            out.close();
        }
    }
}