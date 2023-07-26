package com.trainingapps.saleapp.customerms.util;

import java.util.*;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.entities.Customer;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerUtil {

    @Autowired
    private ProductUtil productUtil;

    public CustomerDetails toCustomerDetails(Customer customer){
        CustomerDetails desired=new CustomerDetails();
        desired.setId(customer.getId());
        desired.setCustomerName(customer.getName());
        List<Product>products= customer.getBoughtProducts();
        if(products!=null) {
            List<ProductDetails>productDetails= productUtil.toListProductDetails(products);
            desired.setProducts(productDetails);
        }
        return desired;
    }
}
