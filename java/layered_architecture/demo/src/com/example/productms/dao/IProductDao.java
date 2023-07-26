package com.example.productms.dao;

import com.example.productms.entity.Product;

public interface IProductDao {
    void add(Product product);

    Product findById(long id);

    void update(Product product);

    Product[] findAll();

}
