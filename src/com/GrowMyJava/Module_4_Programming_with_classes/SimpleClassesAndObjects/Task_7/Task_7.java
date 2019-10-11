package com.GrowMyJava.Module_4_Programming_with_classes.SimpleClassesAndObjects.Task_7;

public class Task_7 {
    //7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
    //площади, периметра и точки пересечения медиан

    public static void main(String[] args) {
        Triangle triangle_test1 = new Triangle();
        System.out.println(triangle_test1.toString());
        triangle_test1.getPerimeter();
        triangle_test1.getSquare();
        triangle_test1.getMedianIntersection();
        System.out.println("---------------------------------------------");
//------------------------------------------------------------------------------
        Triangle triangle_test2 = new Triangle(1.23, 4.56, 7.89);
        System.out.println(triangle_test2.toString());
        triangle_test2.getPerimeter();
        triangle_test2.getSquare();
        //triangle_test2.getMedianIntersection();
        System.out.println("---------------------------------------------");
    }


}
