package com.grow_my_java.module_5_basics_of_oop.Task_5.Source;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.PackageColor;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.PackageType;

import java.util.Random;

public abstract class abstractGift {

    public static Random random = new Random();
    private static int genID = 1;
    private int id;
    private PackageType packageType;
    private PackageColor packageColor;
    private double price;

    public abstractGift() {
        this.id = genID++;
        this.packageType = PackageType.BOX;
        this.packageColor = PackageColor.GOLDEN;
        this.price = 19.99;
    }

    public abstractGift(PackageType aPackageType) {
        this();
        this.packageType = packageType;
        this.price = getRandomPrice();
        this.packageColor = getRandomPackageColor();
    }

    public abstract double getRandomPrice();

    public abstract PackageColor getRandomPackageColor();

    public int getId() {
        return id;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public PackageColor getPackageColor() {
        return packageColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "The " + getPackageType().getName().toLowerCase();
    }
}
