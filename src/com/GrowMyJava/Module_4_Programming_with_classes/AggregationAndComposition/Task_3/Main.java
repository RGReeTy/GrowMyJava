package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_3;

public class Main {
    //3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
    //столицу, количество областей, площадь, областные центры.

    public static void main(String[] args) {

        Logic logic = new Logic();

        //TEST CITY
        City Bobruisk = new City("Bobruisk", 350000);
        City Glusk = new City("Glusk", 50000);
        City Osipovichi = new City("Osipovichi", 75000);

        logic.printCityInfo(Bobruisk);

        //TEST DISTRICT
        District Bobruiskiy = new District("Bobruiskiy", 500);
        District Gluskiy = new District("Gluskiy", 450);
        District Osipovichskiy = new District("Osipovichskiy", 278);
        Bobruiskiy.addCity(Bobruisk);
        Gluskiy.addCity(Glusk);
        Osipovichskiy.addCity(Osipovichi);
        logic.printDistrictInfo(Bobruiskiy);

        //TEST REGION
        Region Mogilevskiy = new Region("Mogilevskiy", "Mogilev");
        Mogilevskiy.addDistrict(Bobruiskiy);
        Mogilevskiy.addDistrict(Gluskiy);
        Mogilevskiy.addDistrict(Osipovichskiy);
        logic.printRegionInfo(Mogilevskiy);

    }

}
