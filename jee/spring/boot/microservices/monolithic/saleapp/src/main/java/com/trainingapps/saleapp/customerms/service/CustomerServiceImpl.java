package com.trainingapps.saleapp.customerms.service;

import com.trainingapps.saleapp.customerms.dao.ICustomerDao;
import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomerRequest;
import com.trainingapps.saleapp.customerms.entities.Customer;
import com.trainingapps.saleapp.customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.saleapp.customerms.util.CustomerUtil;
import com.trainingapps.saleapp.productms.entity.Product;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import com.trainingapps.saleapp.productms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;

    @Autowired
    private CustomerUtil customerUtil;

    @Autowired
    private IProductService productService;

    private long generatedId;

    long generateId(){
        return ++generatedId;
    }

    @Override
    public CustomerDetails register(RegisterCustomerRequest requestData) {
        Customer customer = new Customer();
        long id=generateId();
        customer.setId(id);
        customer.setName(requestData.getName());
        customer = customerDao.save(customer);
        CustomerDetails desired = customerUtil.toCustomerDetails(customer);
        return desired;
    }

    @Override
    public CustomerDetails buyProduct(BuyProduct requestData) throws CustomerNotFoundException, ProductNotFoundException {
        Customer customer = findCustomerById(requestData.getCustomerId());
        Product product = productService.findById(requestData.getProductId());
        List<Product> products = customer.getBoughtProducts();
        if (products == null) {
            products = new ArrayList<>();
            customer.setBoughtProducts(products);
        }
        products.add(product);
        customerDao.save(customer);
        CustomerDetails desired = customerUtil.toCustomerDetails(customer);
        return desired;
    }

    public Customer findCustomerById(long id) throws CustomerNotFoundException {
        Optional<Customer> optional = customerDao.findById(id);
        if (!optional.isPresent()) {
            throw new CustomerNotFoundException("customer not found for id=" + id);
        }
        Customer customer = optional.get();
        return customer;
    }

    @Override
    public CustomerDetails findCustomerDetailsById(long id) throws CustomerNotFoundException {
        Customer customer = findCustomerById(id);
        CustomerDetails desired = customerUtil.toCustomerDetails(customer);
        return desired;
    }
}
