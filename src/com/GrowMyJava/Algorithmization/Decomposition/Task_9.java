package com.GrowMyJava.Algorithmization.Decomposition;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_9 {
    //9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
    //если угол между сторонами длиной X и Y— прямой.
    //Для начала вычислю площадь треугольника. это будет базой.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter X value:");
        int x = scanner.nextInt();
        System.out.println("Please, enter Y value:");
        int y = scanner.nextInt();
        System.out.println("Please, enter Z value:");
        int z = scanner.nextInt();
        System.out.println("Please, enter T value:");
        int t = scanner.nextInt();
        double d = hypotenuseOfTrianglw(x, y);
        if (x < 0 & y < 0 & z < 0 & t < 0) {
            System.out.println("Input a positive values > 0!!");
        } else {
            double square = getQuadrangleSquare(x, y, z, t, d);

            System.out.println("The quadrangle square: " + square);
        }
    }

    private static double hypotenuseOfTrianglw(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    private static double getQuadrangleSquare(int x, int y, int z, int t, double d) {
        return getRectangleSquare(x, y) + getTriangleSquare(d, z, t);
    }

    private static double getTriangleSquare(double d, int z, int t) {
        double p = (z + t + d) / 2;
        return Math.sqrt(p * (p - z) * (p - t) * (p - d));
    }

    private static double getRectangleSquare(int x, int y) {
        return (x * y) / 2;
    }
}