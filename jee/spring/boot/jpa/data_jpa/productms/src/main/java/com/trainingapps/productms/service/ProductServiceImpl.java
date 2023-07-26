package com.trainingapps.productms.service;

import com.trainingapps.productms.dao.IProductRepository;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.InvalidPriceException;
import com.trainingapps.productms.exceptions.InvalidProductIdException;
import com.trainingapps.productms.exceptions.InvalidProductNameException;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository repository;


    @Override
    public Product findById(long id) throws ProductNotFoundException {
        validateId(id);
        Optional<Product> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        Product product = optional.get();
        return product;
    }


    @Override
    public Product findByName(String name) throws ProductNotFoundException {
        Optional<Product> optional = repository.findByName(name);
        if (!optional.isPresent()) {
            throw new ProductNotFoundException("product not found for name=" + name);
        }
        Product product = optional.get();
        return product;
    }

    @Override
    public List<Product> findByPrice(double price) {
        List<Product> list = repository.findByPrice(price);
       return list;
    }

    @Override
    public Product changePrice(long id, double newPrice) throws ProductNotFoundException {
        validateId(id);
        validatePrice(newPrice);
        Product product = findById(id);
        product.setPrice(newPrice);
        product = repository.save(product);
        return product;
    }


    @Override
    public Product addProduct(String productName, double price) {
        validatePrice(price);
        validateName(productName);
        Product product = new Product(productName, price);
        product = repository.save(product);
        return product;
    }


    @Override
    public List<Product> findAll() {
        List<Product> products = repository.findAll();
        return products;
    }

    @Override
    public void deleteProduct(long id) throws ProductNotFoundException {
        boolean exists = repository.existsById(id);
        if (!exists) {
            throw new ProductNotFoundException("product not found");
        }
        repository.deleteById(id);
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
