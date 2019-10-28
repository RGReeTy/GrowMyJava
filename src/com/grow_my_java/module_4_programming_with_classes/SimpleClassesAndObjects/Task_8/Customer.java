package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_8;

import java.text.DecimalFormat;

public class Customer {
    //8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
    //и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

    private int customerID;
    private String name;
    private String surname;
    private String secondName;
    private String address;
    private long cardNumber;

    public Customer(int customerID, String name, String secondName, String surname, String address, long cardNumber) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public void print() {
        DecimalFormat dm = new DecimalFormat();
        dm.setGroupingUsed(true);
        dm.setGroupingSize(4);


        System.out.println("Customer {" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + dm.format(cardNumber) +
                '}');
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Wrong name");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (name != null) {
            this.surname = surname;
        } else {
            System.out.println("Wrong name");
        }
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        } else {
            System.out.println("Wrong address");
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if (customerID > 999_999_999 & customerID < 1_000_000_000) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Wrong number of credit card");
        }
    }
}
