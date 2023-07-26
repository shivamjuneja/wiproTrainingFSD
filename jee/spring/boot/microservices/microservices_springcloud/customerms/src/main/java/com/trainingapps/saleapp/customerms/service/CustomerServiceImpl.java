package com.trainingapps.saleapp.customerms.service;

import com.trainingapps.saleapp.customerms.dao.ICustomerDao;
import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomerRequest;
import com.trainingapps.saleapp.customerms.entities.Customer;
import com.trainingapps.saleapp.customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.saleapp.customerms.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;

    @Autowired
    private CustomerUtil customerUtil;
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
    public CustomerDetails buyProduct(BuyProduct requestData) throws CustomerNotFoundException {
        Customer customer = findCustomerById(requestData.getCustomerId());
        List<Long> products = customer.getBoughtProducts();
        if (products == null) {
            products = new ArrayList<>();
            customer.setBoughtProducts(products);
        }
        products.add(requestData.getProductId());
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
