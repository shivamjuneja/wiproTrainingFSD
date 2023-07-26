package com.example.productms.dao;

import com.example.productms.entity.Product;

public class ProductDaoImpl implements IProductDao {
    private Product store[] = new Product[10];
    private int index = 0;
    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    @Override
    public void add(Product product) {
        long newId = generateId();
        product.setId(newId);
        store[index] = product;
        index++;
    }

    @Override
    public Product findById(long id) {
        for (Product product : store) {
            if (product != null || product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < index; i++) {
            Product iterated = store[i];
            if (iterated.getId() == product.getId()) {
                store[i] = product;
            }
        }

    }

    @Override
    public Product[] findAll() {
        return store;
    }
}
