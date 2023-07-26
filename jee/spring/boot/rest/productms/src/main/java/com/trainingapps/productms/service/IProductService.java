package com.trainingapps.productms.service;

import com.trainingapps.productms.dto.AddProductRequest;
import com.trainingapps.productms.dto.ChangeProductRequest;
import com.trainingapps.productms.dto.ProductDetails;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
public interface IProductService {
    Product findById(@Min(1)long id) throws ProductNotFoundException;

    ProductDetails findProductDetailsById(@Min(1)long id) throws ProductNotFoundException;

    ProductDetails changePrice(@Min(1) long id, @Valid ChangeProductRequest requestData) throws ProductNotFoundException;

    ProductDetails addProduct(@Valid AddProductRequest requestData);

    List<ProductDetails> findAll();

    void deleteById(@Min(1) long productId) throws ProductNotFoundException;
}
