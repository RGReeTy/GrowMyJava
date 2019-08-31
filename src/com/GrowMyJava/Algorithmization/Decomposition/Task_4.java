package com.GrowMyJava.Algorithmization.Decomposition;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    //4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    //из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println("Input a XY coordinate for a first point = ");
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        System.out.println("Input a XY coordinate for a second point = ");
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();
        System.out.println("Input a XY coordinate for a third point = ");
        int X3 = scanner.nextInt();
        int Y3 = scanner.nextInt();
        if (X1 < 0 & Y1 < 0 & X2 < 0 & Y2 < 0 & X3 < 0 & Y3 < 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] point1 = {X1, Y1};
            int[] point2 = {X2, Y2};
            int[] point3 = {X3, Y3};
            double[] distances = {findDistance(point1, point2), findDistance(point2, point3), findDistance(point1, point3)};
            System.out.println("The distances between point are " + Arrays.toString(distances));
            if (maxDistance(distances) == distances[0]) {
                System.out.println("So maximal distance is between points 1 and 2 with value " + distances[0]);
            } else if (maxDistance(distances) == distances[1]) {
                System.out.println("So maximal distance is between points 2 and 3 with value " + distances[1]);
            } else {
                System.out.println("So maximal distance is between points 1 and 3 with value " + distances[2]);
            }
        }
    }

    private static double maxDistance(double[] distances) {
        double maxValue = 0;
        for (int i = 0; i < distances.length; i++) {
            if (maxValue < distances[i]) maxValue = distances[i];
        }
        return maxValue;
    }

    private static double findDistance(int[] pointFirst, int[] pointSecond) {
        //DecimalFormat f = new DecimalFormat("##.###");
        // System.out.println(f.format(distance));
        return Math.sqrt((Math.pow((pointFirst[0] - pointSecond[0]), 2) + (Math.pow((pointFirst[1] - pointSecond[1]), 2))));
    }
}
