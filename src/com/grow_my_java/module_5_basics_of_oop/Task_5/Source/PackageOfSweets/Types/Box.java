package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Types;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.PackageColor;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.PackageFactory;

public class Box extends PackageFactory {

    @Override
    public double getRandomPrice() {
        return 10;
    }

    @Override
    public PackageColor getRandomPackageColor() {
        return PackageColor.PURPLE;
    }
}
