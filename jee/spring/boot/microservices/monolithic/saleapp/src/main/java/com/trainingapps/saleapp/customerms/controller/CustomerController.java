package com.trainingapps.saleapp.customerms.controller;

import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomerRequest;
import com.trainingapps.saleapp.customerms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RestController
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/byid/{id}")
    public CustomerDetails getById(@PathVariable long id) throws Exception{
        return customerService.findCustomerDetailsById(id);
    }

    @PostMapping("/register")
    public CustomerDetails register(@RequestBody RegisterCustomerRequest request){
        return customerService.register(request);
    }

    @PutMapping("/product/buy")
    public CustomerDetails buyProduct(@RequestBody BuyProduct request) throws Exception{
        return customerService.buyProduct(request);
    }


}
