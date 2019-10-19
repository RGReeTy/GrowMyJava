package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_4;

public class BankService_MainTask {
    //4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
    //счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
    //всем счетам, имеющим положительный и отрицательный балансы отдельно.

    public static void main(String[] args) {

        BusinessLogic logic = new BusinessLogic();

        Invoice salaryAccount = new Invoice(9554466, 2253.55, false);
        Invoice creditAccount = new Invoice(1232455, -1215.34, false);
        Invoice secretAccount = new Invoice(5566489, 613.34, true);

        Client gabeNewell = new Client(256, "Gabe Newell");
        gabeNewell.addInvoice(salaryAccount);
        gabeNewell.addInvoice(creditAccount);
        gabeNewell.addInvoice(secretAccount);

        logic.printClientInfo(gabeNewell);

        logic.getAllAmounts(gabeNewell);
        System.out.println("------------------------------------------------------------------------");
        logic.getPlusAndMinusAmounts(gabeNewell);

    }
}
