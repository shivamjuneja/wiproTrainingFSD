package com.trainingapps.saleapp.productms.entity;

public class Product {
    private long id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
