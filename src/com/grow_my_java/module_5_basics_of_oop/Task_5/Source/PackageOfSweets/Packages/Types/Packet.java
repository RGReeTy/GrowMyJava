package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.Types;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageColor;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageFactory;

public class Packet extends PackageFactory {

    @Override
    public double getRandomPrice() {
        return 8.0;
    }

    @Override
    public PackageColor getRandomPackageColor() {
        return PackageColor.CORAL;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "type=" + type +
                '}';
    }
}
