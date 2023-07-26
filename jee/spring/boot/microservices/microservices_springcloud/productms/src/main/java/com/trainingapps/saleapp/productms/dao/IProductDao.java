package com.trainingapps.saleapp.productms.dao;

import com.trainingapps.saleapp.productms.entity.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);

    Product findById(long id);

    void update(Product product);

    List<Product> findAll();

    void remove(Product product);
}
