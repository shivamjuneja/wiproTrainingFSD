package com.trainingapps.productms.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trainingapps.productms.dto.ProductDetails;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.service.IProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(ProductRestApi.class)
class ProductRestApiMvcTest {


    @MockBean
    IProductService service;

    @Autowired
    MockMvc mvc;



    /**
     * scenario: product is  found in the store
     * input : id=10
     * expectation: product details returned as response, status 200/ok
     */
    @Test
    public void testGetById_1()throws Exception{
        int id =10;
        String name="samsung";
        double price=10000;
        ProductDetails details = new ProductDetails();
        details.setId(id);
        details.setName(name);
        details.setPrice(price);
        when(service.findProductDetailsById(id)).thenReturn(details);
        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(details);
        System.out.println("**created json="+json);
        String url="/products/byid/10";
        mvc.perform(get(url))
                .andExpect(status().isOk())
        .andExpect(content().json(json));

    }

    /**
     * scenario: product is not found in the store
     * input : id=10
     * expectation: ProductNotFoundException is thrown. status 404/NOT_FOUND
     */
    @Test
    public void testGetById_2() throws Exception{
        int id=10;
        String msg="product not found";
        ProductNotFoundException e=new ProductNotFoundException(msg);
        when(service.findProductDetailsById(id)).thenThrow(e);
        String url="/products/byid/10";
        mvc.perform(get(url))
                .andExpect(status().isNotFound())
                .andExpect(content().string(msg));

    }


}