package com.trainingapps.saleapp.customerms.util;

import java.util.*;

import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.ProductDetails;
import com.trainingapps.saleapp.customerms.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerUtil {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${product.baseurl}")
    private String baseProductUrl;

    public CustomerDetails toCustomerDetails(Customer customer) {
        CustomerDetails desired = new CustomerDetails();
        desired.setId(customer.getId());
        desired.setCustomerName(customer.getName());
        List<Long> products = customer.getBoughtProducts();
        if (products != null) {
            List<ProductDetails> productDetails = fetchProductsListByProductId(products);
            desired.setProducts(productDetails);
        }
        return desired;
    }


    public ProductDetails fetchProductsByProductId(long productId) {
        String url = baseProductUrl + "/byid/" + productId;
        ProductDetails response = restTemplate.getForObject(url, ProductDetails.class);
        return response;
    }


    public List<ProductDetails> fetchProductsListByProductId(List<Long> productsId) {
        List<ProductDetails> responseList = new ArrayList<>();
        for (long productId : productsId) {
            ProductDetails response = fetchProductsByProductId(productId);
            responseList.add(response);
        }
        return responseList;
    }
}
