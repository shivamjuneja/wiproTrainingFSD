package com.trainingapps.demo.service;

import com.trainingapps.demo.entity.Customer;
import com.trainingapps.demo.exceptions.CustomerNotFoundException;
import com.trainingapps.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository repository;

    private Random random = new Random();


    public String generateId() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(99);
            builder.append(randomNum);
        }
        String generatedId = builder.toString();
        return generatedId;
    }

    @Override
    public Customer add(String name, int age) {
        String id = generateId();
        Customer customer = new Customer(name, age);
        customer.setId(id);
        Customer saved = repository.save(customer);
        return saved;
    }

    @Override
    public Customer changeName(String id, String newName) throws CustomerNotFoundException {
        Customer customer = findById(id);
        customer.setName(newName);
        Customer saved = repository.save(customer);
        return saved;
    }

    @Override
    public Customer findById(String id) throws CustomerNotFoundException {
        Optional<Customer> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw new CustomerNotFoundException("customer not found for id=" + id);
        }
        Customer customer = optional.get();
        return customer;
    }


}
