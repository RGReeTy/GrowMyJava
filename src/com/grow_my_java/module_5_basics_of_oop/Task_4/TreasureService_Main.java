package com.grow_my_java.module_5_basics_of_oop.Task_4;

import com.grow_my_java.module_5_basics_of_oop.Task_4.Source.CaveOfTreasures;
import com.grow_my_java.module_5_basics_of_oop.Task_4.Source.OperationsUnderTheTreasures;

public class TreasureService_Main {
    //Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
    //дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
    //выбора сокровищ на заданную сумму.

    public static void main(String[] args) {


        CaveOfTreasures caveOfTreasures = new CaveOfTreasures("Horrible Dragon Cave");
        OperationsUnderTheTreasures logic = new OperationsUnderTheTreasures(caveOfTreasures);

        logic.printInfo();
        System.out.println("------------------------------------------------------------");
        logic.fillArrayListOfTreasures();
        logic.printInfo();
        System.out.println("------------------------------------------------------------");
        logic.whereIsMostExpensiveTreasure();
        System.out.println("------------------------------------------------------------");
        logic.selectTreasuresAtDefinitelyCount(175.5, 100.0);
    }
}
