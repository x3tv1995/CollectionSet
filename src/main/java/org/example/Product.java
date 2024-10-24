package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private LocalDate dateCreate;
    private LocalDate dateEnd;

    public Product(String name, double price, LocalDate dateCreate, LocalDate dateEnd) {
        this.name = name;
        this.price = price;
        this.dateCreate = dateCreate;
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateCreate=" + dateCreate +
                ", dateEnd=" + dateEnd +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(dateCreate, product.dateCreate) && Objects.equals(dateEnd, product.dateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, dateCreate, dateEnd);
    }
}
