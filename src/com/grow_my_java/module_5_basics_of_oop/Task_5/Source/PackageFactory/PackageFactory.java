package com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageFactory;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.PackageType;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.Types.Box;
import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Packages.Types.Packet;

public class PackageFactory {

    public <T> T PackageFactory(PackageType type, String name) {
        PackageType packageType = PackageType.valueOf(name);
        switch (packageType) {
            case BOX:
                return (T) new Box();
            case PACKET:
                return (T) new Packet();
            default:
                throw new IllegalStateException("Unexpected value: " + packageType);
        }
    }
}
