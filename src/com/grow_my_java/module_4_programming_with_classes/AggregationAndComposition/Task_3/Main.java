package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_3;

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
        Region Mogilevskaya = new Region("Mogilevskaya", "Mogilev");
        Mogilevskaya.addDistrict(Bobruiskiy);
        Mogilevskaya.addDistrict(Gluskiy);
        Mogilevskaya.addDistrict(Osipovichskiy);
        logic.printRegionInfo(Mogilevskaya);
        //------------------------------------------------------------------------------------------------------------
        City Minsk = new City("Minsk", 2000000);
        District Minskiy = new District("Minskiy", 625);
        Minskiy.addCity(Minsk);
        Region Minskaya = new Region("Minskiy", "Minsk");
        Minskaya.addDistrict(Minskiy);
        logic.printRegionInfo(Minskaya);

        //TEST GOVERNMENT
        Goverment Belarus = new Goverment("Belarus", "Minsk");
        Belarus.addRegion(Mogilevskaya);
        Belarus.addRegion(Minskaya);
        logic.printCountyInfo(Belarus);
    }

}
