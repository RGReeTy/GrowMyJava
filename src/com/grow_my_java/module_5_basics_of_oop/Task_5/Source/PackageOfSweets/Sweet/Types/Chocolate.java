package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet.Types;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet.Sweet;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet.SweetType;
import com.grow_my_java.module_5_basics_of_oop.Task_5.GiftFactory.abstractGift;

public class Chocolate extends Sweet {

    public Chocolate() {
        super();
        type = SweetType.CHOCOLATE;
    }

    @Override
    public double getRandomPrice() {
        return abstractGift.random.nextInt(15) + 1;
    }
}
