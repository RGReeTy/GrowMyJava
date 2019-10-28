package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_7;

public class Task_7 {
    //7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
    //площади, периметра и точки пересечения медиан

    public static void main(String[] args) {
        Triangle triangle_test1 = new Triangle();
        triangle_test1.print();
        triangle_test1.getPerimeter();
        triangle_test1.getSquare();
        triangle_test1.getMedianIntersection();
        System.out.println("---------------------------------------------");
//------------------------------------------------------------------------------
        Triangle triangle_test2 = new Triangle(1.23, 4.56, 7.89);
        triangle_test2.print();
        triangle_test2.getPerimeter();
        triangle_test2.getSquare();
        System.out.println("---------------------------------------------");
    }


}
