package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageFactory;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageFactory;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet.Sweet;

import java.util.List;

public class FinalGift {

    private static int getId = 1;
    private int id;
    private String name;
    private List<Sweet> sweets;
    private List<PackageFactory> packageFactoryList;
}
