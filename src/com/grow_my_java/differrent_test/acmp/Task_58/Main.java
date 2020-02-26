package com.grow_my_java.differrent_test.acmp.Task_58;

import java.io.PrintWriter;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        int n, m;
        boolean isPretty = false;

        for (int i = 1; i <= t; i++) {

            isPretty = false;
            n = in.nextInt();
            m = in.nextInt();
            int[][] array = new int[n][m];

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) array[a][b] = in.nextInt();
            }

            for (int a = 0; a < n - 1; a++) {
                for (int b = 0; b < m - 1; b++) {
                    int sum = array[a][b] + array[a + 1][b] + array[a][b + 1] + array[a + 1][b + 1];
                    if (sum == 4 || sum == 0) {
                        isPretty = true;
                        break;
                    }

                }

            }
            if (isPretty == false) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();
    }
}