package com.example.productms.service;

import com.example.productms.dao.IProductDao;
import com.example.productms.dao.ProductDaoImpl;
import com.example.productms.entity.Product;
import com.example.productms.exceptions.InvalidPriceException;
import com.example.productms.exceptions.InvalidProductIdException;
import com.example.productms.exceptions.InvalidProductNameException;
import com.example.productms.exceptions.ProductNotFoundException;

public class ProductServiceImpl implements IProductService {
    private IProductDao dao = new ProductDaoImpl();

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
        Product product=findById(id);
        product.setPrice(newPrice);
        dao.update(product);
        return product;
    }

    @Override
    public Product addProduct(String productName, double price) {
        validatePrice(price);
        validateName(productName);
        Product product=new Product(productName,price);
        dao.add(product);
        return product;
    }

    @Override
    public Product[] findAll() {
        Product products[]= dao.findAll();
        return products;
    }

    void validateName(String name){
        if(name==null||name.isEmpty() || name.length()<2 |name.length()>10){
            throw new InvalidProductNameException("invalid product name");
        }
    }

    void validatePrice(double price){
        if(price<0){
            throw new InvalidPriceException("invalid price");
        }
    }

    void validateId(long id) {
        if (id <= 0) {
            throw new InvalidProductIdException("invalid product id=" + id);
        }
    }
}
