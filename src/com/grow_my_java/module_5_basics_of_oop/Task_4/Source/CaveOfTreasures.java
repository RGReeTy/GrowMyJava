package com.grow_my_java.module_5_basics_of_oop.Task_4.Source;

import java.util.ArrayList;

public class CaveOfTreasures {

    private String nameOfDragonsCave;
    private ArrayList<Treasure> treasures;

    public CaveOfTreasures(String nameOfDragonsCave) {
        this.nameOfDragonsCave = nameOfDragonsCave;
        this.treasures = new ArrayList<>();
    }

    public String getNameOfDragonsCave() {
        return nameOfDragonsCave;
    }

    public void setNameOfDragonsCave(String nameOfDragonsCave) {
        this.nameOfDragonsCave = nameOfDragonsCave;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }


    @Override
    public String toString() {
        return "CaveOfTreasures{" +
                "nameOfDragonsCave='" + nameOfDragonsCave + '\'' +
                ", treasures=" + treasures +
                '}';
    }
}
