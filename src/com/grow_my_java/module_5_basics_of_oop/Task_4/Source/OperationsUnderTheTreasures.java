package com.grow_my_java.module_5_basics_of_oop.Task_4.Source;

import java.text.DecimalFormat;
import java.util.Random;

public class OperationsUnderTheTreasures {

    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private CaveOfTreasures caveOfTreasures;

    public OperationsUnderTheTreasures(CaveOfTreasures caveOfTreasures) {
        this.caveOfTreasures = caveOfTreasures;
    }

    public void fillArrayListOfTreasures() {
        for (int i = 0; i < 100; i++) {
            Treasure gold = new Treasure("Piece of gold",
                    "A piece of gold taken from miserable people", getRandomCount());
            addTreasure(gold);
        }
    }

    private double getRandomCount() {
        double leftLimit = 10D;
        double rightLimit = 1000D;
        return leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);
    }

    public boolean addTreasure(Treasure treasure) {
        return caveOfTreasures.getTreasures().add(treasure);
    }

    public boolean deleteTreasure(Treasure treasure) {
        return caveOfTreasures.getTreasures().remove(treasure);
    }

    public void printInfo() {
        if (caveOfTreasures.getTreasures().isEmpty()) {
            System.out.println("The cave is empty!");
            return;
        }
        for (Treasure treasure : caveOfTreasures.getTreasures()) {
            System.out.println("Treasure №" + treasure.getId() + " " + treasure.getTypeOfTreasure() + " - " +
                    treasure.getDescriptionOfTreasure() + " has count of " + String.format("%.2f", treasure.getCount())
                    + " talers.");
        }
    }

    public void whereIsMostExpensiveTreasure() {
        double max = 0;
        int index = 0;
        String type = null;
        String description = null;
        for (Treasure treasure : caveOfTreasures.getTreasures()) {
            if (treasure.getCount() > max) {
                max = treasure.getCount();
                index = treasure.getId();
                type = treasure.getTypeOfTreasure();
                description = treasure.getDescriptionOfTreasure();
            }
        }
        System.out.println("Treasure №" + index + " " + type + " - " + description +
                " is most expensive item with count of " + String.format("%.2f", max) + " talers.");
    }

    public void selectTreasuresAtDefinitelyCount(Double min, Double max) {
        //check for min/max values == min / max range
        if (min > max) {
            double temp = max;
            max = min;
            min = temp;
        }
        boolean isExist = false;
        System.out.println("Trying to find treasures with count more than " + min + " and less than " + max + " talers..");
        for (Treasure treasure : caveOfTreasures.getTreasures()) {
            if (treasure.getCount() > min & treasure.getCount() < max) {
                isExist = true;
                System.out.println("Treasure №" + treasure.getId() + " " + treasure.getTypeOfTreasure() + " - " +
                        " has count in definitely range most expensive item with count of "
                        + String.format("%.2f", treasure.getCount()) + " talers.");
            }
        }
        if (!isExist) System.out.println("Hmm, there are none of treasures at that range of counts");
    }
}