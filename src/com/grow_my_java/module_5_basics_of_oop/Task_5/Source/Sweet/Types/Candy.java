package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet.Types;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet.Sweet;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet.SweetType;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.abstractGift;

public class Candy extends Sweet {
    public Candy() {
        super();
        type = SweetType.CANDY;
    }

    @Override
    public double getRandomPrice() {
        return abstractGift.random.nextInt(19) + 1;
    }
}
