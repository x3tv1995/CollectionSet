package org.example;

import java.time.LocalDate;
import java.util.*;

public class CollectionSet {
    static Set<Product> products = new HashSet<>();
    static Set<Product> products2 = new HashSet<>();

    public static void main(String[] args) {
        Product product = new Product(
                "Pomidor",
                222.2,
                LocalDate.of(2024, 9, 27),
                LocalDate.of(2024, 10, 21)
        );
        Product product1 = new Product(
                "Apple",
                120.5,
                LocalDate.of(2024, 10, 15),
                LocalDate.of(2024, 11, 15)
        );

        Product product2 = new Product(
                "Orange",
                80.0,
                LocalDate.of(2024, 10, 10),
                LocalDate.of(2024, 11, 10)
        );

        Product product3 = new Product(
                "Banana",
                65.3,
                LocalDate.of(2024, 10, 20),
                LocalDate.of(2024, 11, 20)
        );

        Product product4 = new Product(
                "Grapes",
                200.0,
                LocalDate.of(2024, 10, 18),
                LocalDate.of(2024, 11, 18)
        );

        Product product5 = new Product(
                "Strawberry",
                350.7,
                LocalDate.of(2024, 10, 25),
                LocalDate.of(2024, 11, 25)
        );

        Product product6 = new Product(
                "Strawberry",
                350.7,
                LocalDate.of(2024, 10, 25),
                LocalDate.of(2024, 11, 25)
        );


        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products2.addAll(products);


        productsOverdue();
        productsWillDeteriorate();
        productsNotOverdue();
        System.out.println("Сумма всех продуктов: " + amount());

    }

    //метод который выводит только те продукты которые уже просроченные
    public static void productsOverdue() {
        for (Product product : products) {
            boolean overdue = LocalDate.now().isAfter(product.getDateEnd());
            if (overdue) {
                System.out.println("Продукт просрочен: " + product.getName());
            }
        }

    }

    //метод который выводит только те продукты которые будут просроченны в течении 3 дней
    public static void productsWillDeteriorate() {
        for (Product product : products) {
            boolean overdue = LocalDate.now().isAfter(product.getDateEnd().minusDays(3));
            if (overdue) {
                System.out.println("Продукт будет  просрочен через 3 дня: " + product.getName());
            }
        }

    }

    //метод который выводить сумму всех продуктов
    public static double amount() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    //метод который вернет обратно новый сет из продуктов которые не просроченые
    public static void productsNotOverdue() {
        for (Product product : products2) {
            boolean overdue = LocalDate.now().isAfter(product.getDateEnd());
            if (!overdue) {
                System.out.println("Продукты не просрочены: " + product.getName());
            }
        }

    }

}






