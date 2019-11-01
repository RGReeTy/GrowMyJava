package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageType;

import java.util.ArrayList;
import java.util.List;

public class SweetGift {

    private static int genID = 1;
    private int id;
    private String name;
    private List<SweetType> sweetTypes;
    private List<PackageType> packageTypes;

    public SweetGift() {
        this.id = genID++;
        this.name = "Sweet Gift!";
        this.sweetTypes = new ArrayList<>();
        this.packageTypes = new ArrayList<>();
    }

    public SweetGift(String name) {
        this();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SweetType> getSweetTypes() {
        return sweetTypes;
    }

    public List<PackageType> getPackageTypes() {
        return packageTypes;
    }

    public boolean addSweet(SweetType sweetType) {
        return sweetTypes.add(sweetType);
    }

    public boolean removeSweet(SweetType sweetType) {
        return sweetTypes.remove(sweetType);
    }

}
