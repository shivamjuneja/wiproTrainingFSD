package com.trainingapps.productms.dao;

import com.trainingapps.productms.entity.Product;

import java.util.List;

public interface IProductDao {
    Product save(Product product);

    Product findById(long id);

    List<Product> findProductByName(String productName);

    List<Product> findAll();

}
