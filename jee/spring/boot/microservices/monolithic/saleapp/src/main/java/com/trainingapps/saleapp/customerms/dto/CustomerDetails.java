package com.trainingapps.saleapp.customerms.dto;

import com.trainingapps.saleapp.productms.dto.ProductDetails;

import java.util.List;

public class CustomerDetails {

    private Long id;
    private String customerName;
    private List<ProductDetails>products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<ProductDetails> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDetails> products) {
        this.products = products;
    }
}
