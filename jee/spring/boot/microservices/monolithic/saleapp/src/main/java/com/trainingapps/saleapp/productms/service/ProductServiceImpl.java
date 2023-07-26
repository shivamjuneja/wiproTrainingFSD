package com.trainingapps.saleapp.productms.service;

import com.trainingapps.saleapp.productms.dao.IProductDao;
import com.trainingapps.saleapp.productms.dto.AddProductRequest;
import com.trainingapps.saleapp.productms.dto.ChangeProductRequest;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import com.trainingapps.saleapp.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
        dao.update(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public ProductDetails addProduct(AddProductRequest requestData) {
        Product product = new Product(requestData.getName(), requestData.getPrice());
        dao.add(product);
        ProductDetails desired=util.toProductDetails(product);
        return desired;
    }

    @Override
    public List<ProductDetails> findAll() {
        List<Product> products = dao.findAll();
        List<ProductDetails>desired=util.toListProductDetails(products);
        return desired;
    }

    @Override
    public void deleteById(long productId) throws ProductNotFoundException{
       Product product=findById(productId);
        dao.remove(product);
    }

}
