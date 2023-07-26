package com.trainingapps.productms.service;

import com.trainingapps.productms.dao.IProductDao;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.InvalidPriceException;
import com.trainingapps.productms.exceptions.InvalidProductIdException;
import com.trainingapps.productms.exceptions.InvalidProductNameException;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao dao;


    @Override
    public Product findById(long id) throws ProductNotFoundException {
        validateId(id);
        Product product = dao.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        return product;
    }


    @Override
    public Product changePrice(long id, double newPrice) throws ProductNotFoundException {
        validateId(id);
        validatePrice(newPrice);
        Product product = findById(id);
        product.setPrice(newPrice);
        product = dao.save(product);
        return product;
    }


    @Override
    public Product addProduct(String productName, double price) {
        validatePrice(price);
        validateName(productName);
        Product product = new Product(productName, price);
        product = dao.save(product);
        return product;
    }


    @Override
    public List<Product> findAll() {
        List<Product> products = dao.findAll();
        return products;
    }

    void validateName(String name) {
        if (name == null || name.isEmpty() || name.length() < 2 | name.length() > 10) {
            throw new InvalidProductNameException("invalid product name");
        }
    }

    void validatePrice(double price) {
        if (price < 0) {
            throw new InvalidPriceException("invalid price");
        }
    }

    void validateId(long id) {
        if (id <= 0) {
            throw new InvalidProductIdException("invalid product id=" + id);
        }
    }
}
