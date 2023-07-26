package com.trainingapps.demo.frontend;

import com.trainingapps.demo.entity.Customer;
import com.trainingapps.demo.exceptions.CustomerNotFoundException;
import com.trainingapps.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrontEnd {

    @Autowired
    private ICustomerService service;

    public void runUI() {
        try {
            System.out.println("****Frontnd ui getting rendered");
            Customer customer1 = service.add("harsh", 21);
            Customer customer2 = service.add("somnath", 22);
            System.out.println("inserted 2 documents for customer collection");
            display(customer1);
            display(customer2);
            String id = customer1.getId();
            Customer found = service.findById(id);
            display(found);
            Customer updated=service.changeName(id, "harsh kumar");
            System.out.println("customer name changed");
            display(updated);

        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void display(Customer customer) {
        System.out.println(customer.getId() + "-" + customer.getName() + "-" + customer.getAge());
    }

}
