package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_4;

public class BankService_MainTask {
    //4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
    //счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
    //всем счетам, имеющим положительный и отрицательный балансы отдельно.

    public static void main(String[] args) {

        BusinessLogic logic = new BusinessLogic();

        Invoice salaryAccount = new Invoice(9554466, 253.55, false);
        logic.print(salaryAccount);

    }
}
