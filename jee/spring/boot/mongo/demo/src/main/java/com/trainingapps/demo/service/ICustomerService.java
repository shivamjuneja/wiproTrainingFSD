package com.trainingapps.demo.service;

import com.trainingapps.demo.entity.Customer;
import com.trainingapps.demo.exceptions.CustomerNotFoundException;

public interface ICustomerService {

    Customer add(String name, int age);

    Customer changeName(String id, String newName) throws CustomerNotFoundException;

    Customer findById(String id) throws CustomerNotFoundException;


}
