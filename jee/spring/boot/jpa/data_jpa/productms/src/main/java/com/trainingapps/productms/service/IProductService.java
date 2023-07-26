package com.trainingapps.productms.service;

import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Product findById(long id) throws ProductNotFoundException;

    Product findByName(String name) throws ProductNotFoundException;

    List<Product> findByPrice(double price);

    Product changePrice(long id, double newPrice) throws ProductNotFoundException;

    Product addProduct(String productName, double price);

    List<Product> findAll();

    void deleteProduct(long id) throws ProductNotFoundException;
}
