package com.trainingapps.saleapp.customerms.dao;

import com.trainingapps.saleapp.customerms.entities.Customer;

import java.util.Optional;

public interface ICustomerDao {

   Customer save(Customer customer);

   Optional<Customer> findById(Long id);

}
