package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageColor;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageType;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.abstractGift;

import java.util.Objects;

public class Sweet extends abstractGift {

    protected SweetType type;

    public Sweet() {
        super();
    }

    public Sweet(PackageType aPackageType, SweetType type) {
        super(aPackageType);
        this.type = type;
    }

    public SweetType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return type == sweet.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public double getRandomPrice() {
        return 0;
    }

    @Override
    public PackageColor getRandomPackageColor() {
        return null;
    }
}
