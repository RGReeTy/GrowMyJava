package com.grow_my_java.module_5_basics_of_oop.Task_2;

import com.grow_my_java.module_5_basics_of_oop.Task_2.source.Payment;
import com.grow_my_java.module_5_basics_of_oop.Task_2.source.Product;

public class Main {
    //2. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
    //нескольких товаров.

    public static void main(String[] args) {

        Product product1 = new Product("Bicycle", "Transport", 999.99);
        Product product2 = new Product("Bed", "Furniture", 549.89);
        Product product3 = new Product("Toy", "For kids", 19.89);
        Product product4 = new Product("Hook", "Sport", 44.89);
        Product product5 = new Product("Drill", "Instrument", 99.89);

        Payment payment = new Payment();

        payment.addProduct(product1);
        payment.addProduct(product2);
        payment.addProduct(product4);
        payment.removeProduct(product1);

        payment.makePayment();
    }
}
