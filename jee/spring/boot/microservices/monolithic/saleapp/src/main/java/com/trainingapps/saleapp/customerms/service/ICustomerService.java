package com.trainingapps.saleapp.customerms.service;

import com.trainingapps.saleapp.customerms.dto.BuyProduct;
import com.trainingapps.saleapp.customerms.dto.CustomerDetails;
import com.trainingapps.saleapp.customerms.dto.RegisterCustomerRequest;
import com.trainingapps.saleapp.customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Validated
public interface ICustomerService {

   CustomerDetails register(@Valid RegisterCustomerRequest requestData);

   CustomerDetails buyProduct(@Valid BuyProduct requestData) throws CustomerNotFoundException, ProductNotFoundException;

   CustomerDetails findCustomerDetailsById(@Min(1)long id) throws CustomerNotFoundException;



}
