package com.example.demooo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Products")

public class Products {

    private String name;
    private double price;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String description;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Products(String name, double price, long id, String description) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
