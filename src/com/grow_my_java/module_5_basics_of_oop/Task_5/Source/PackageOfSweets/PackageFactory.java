package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.abstractGift;

public abstract class PackageFactory extends abstractGift {

    protected PackageType type;

    public PackageFactory() {
        super();
    }

    public PackageFactory(PackageType type) {
        super(type);
    }

    public PackageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageFactory that = (PackageFactory) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = getPackageType().hashCode();
        result = result * 31 + type.hashCode();
        return result;
    }
}
