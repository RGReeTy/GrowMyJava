package com.GrowMyJava.Module_4_Programming_with_classes.SimpleClassesAndObjects.Task_7;

import java.math.BigDecimal;

public class Triangle {
    //7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
    //площади, периметра и точки пересечения медиан

    //sides of triangle:
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a > 0 & b > 0 & c > 0) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Mistake!");
        }
    }

    public Triangle() {
        this.a = 1.1;
        this.b = 2.2;
        this.c = 3.3;
    }

    public void getPerimeter() {
        System.out.println("Perimeter = " + a + b + c);
    }

    public void getSquare() {
        //1/2 half of perimeter
        double p = a + b + c;
        System.out.println("Square =" + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public void getMedianIntersection() {
        BigDecimal result = BigDecimal.valueOf(Math.sqrt(((2 * a * a) + (2 * b * b) - (c * c)) / 2));
        System.out.println("Median intersection =" + result);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void print() {
        System.out.println("Triangle with sides " + "a=" + a + ", b=" + b + ", c=" + c);
    }
}
