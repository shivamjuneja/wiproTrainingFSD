package com.example.productms.service;

import com.example.productms.entity.Product;
import com.example.productms.exceptions.ProductNotFoundException;

public interface IProductService {
    Product findById(long id) throws ProductNotFoundException;

    Product changePrice(long id, double newPrice) throws ProductNotFoundException;

    Product addProduct(String productName, double price);

    Product[] findAll();
}
