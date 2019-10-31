package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet.Types;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet.Sweet;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.Sweet.SweetType;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.abstractGift;

public class Cookies extends Sweet {
    public Cookies() {
        super();
        type = SweetType.COOKIES;
    }

    @Override
    public double getRandomPrice() {
        return abstractGift.random.nextInt(10) + 1;
    }
}
