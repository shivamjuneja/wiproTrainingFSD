package com.trainingapps.productms.service;

import com.trainingapps.productms.dao.IProductDao;
import com.trainingapps.productms.dao.ProductDaoImpl;
import com.trainingapps.productms.dto.AddProductRequest;
import com.trainingapps.productms.dto.ChangeProductRequest;
import com.trainingapps.productms.dto.ProductDetails;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.InvalidPriceException;
import com.trainingapps.productms.exceptions.InvalidProductIdException;
import com.trainingapps.productms.exceptions.InvalidProductNameException;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.util.ProductUtil;
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

    @Autowired
    private ProductUtil util;

    @Override
    public Product findById(long id) throws ProductNotFoundException {
        Product product = dao.findById(id);
        if (product == null) {
            throw new ProductNotFoundException("product not found for id=" + id);
        }
        return product;
    }

    @Override
    public ProductDetails findProductDetailsById(long id) throws ProductNotFoundException {
        Product product= findById(id);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public ProductDetails changePrice(long id, ChangeProductRequest requestData) throws ProductNotFoundException {
        Product product = findById(id);
        product.setPrice(requestData.getNewPrice());
        product=dao.save(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public ProductDetails addProduct(AddProductRequest requestData) {
        Product product = new Product(requestData.getName(), requestData.getPrice());
        product=dao.save(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public List<ProductDetails> findAll() {
        List<Product> products = dao.findAll();
        List<ProductDetails>desired=util.toListProductDetails(products);
        return desired;
    }

}