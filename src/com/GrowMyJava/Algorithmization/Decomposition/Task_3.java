package com.GrowMyJava.Algorithmization.Decomposition;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_3 {
    //3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
    //треугольника.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println("Input a side's length of hexagon = ");
        int side = scanner.nextInt();
        if (side <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            System.out.println("The square of hexagon is: \n" + squareOfHexagon(side));
            scanner.close();
            printWriter.close();
        }
    }

    private static double squareOfHexagon(int side) {
        return squareOfTriangle(side) * 6;
    }

    private static double squareOfTriangle(int side) {
        return (Math.sqrt(3) / 4) * side * side;
    }
}
