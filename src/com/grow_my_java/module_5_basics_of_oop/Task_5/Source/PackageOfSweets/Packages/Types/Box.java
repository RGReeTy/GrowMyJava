package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.Types;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageColor;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageFactory;

public class Box extends PackageFactory {

    public Box() {
        super();
    }

    @Override
    public double getRandomPrice() {
        return 10;
    }

    @Override
    public PackageColor getRandomPackageColor() {
        return PackageColor.PURPLE;
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + type +
                '}';
    }
}

