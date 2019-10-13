package com.GrowMyJava.Module_4_Programming_with_classes.SimpleClassesAndObjects.Task_8;

public class Task_8 {
    //8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
    //и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

    public static void main(String[] args) {
        Customer[] customers = {
                new Customer(101, "Ivan", "Olegovich", "Rogov", "Minsk", 9253_0000_4584_1455L),
                new Customer(111, "Elena", "Ivanovna", "Pears", "Brest", 5254_1646_4464_9999L),
                new Customer(133, "Chan", "Lee", "Kim", "Huanhe", 1103_1314_4455_7799L),
        };

        for (Customer customer : customers) {
            customer.print();
        }

        System.out.println("-----------------------------------------------------------------");

        Customer[] sortedCustomerBySurname = sortUsersBySurname(customers);
        for (Customer customer : sortedCustomerBySurname) {
            customer.print();
        }

        System.out.println("-----------------------------------------------------------------");

        showCustomerWithSpecificCreditCard(customers);

    }

    //show sorting customers by alphabet
    private static Customer[] sortUsersBySurname(Customer[] customers) {
        for (int i = 0; i < customers.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[j].getSurname().compareToIgnoreCase(customers[temp].getSurname()) < 0) {
                    temp = j;
                }
            }
            Customer val = customers[temp];
            customers[temp] = customers[i];
            customers[i] = val;
        }
        return customers;
    }

    //show customers with specific numbers of credit card
    private static void showCustomerWithSpecificCreditCard(Customer[] customers) {
        long min_range = 1111_1111_1111_1111L;
        long max_range = 9000_0000_0000_0000L;
        for (Customer customer : customers) {
            if (customer.getCardNumber() >= min_range && customer.getCardNumber() <= max_range) {
                System.out.println(customer);
            }
        }

    }
}