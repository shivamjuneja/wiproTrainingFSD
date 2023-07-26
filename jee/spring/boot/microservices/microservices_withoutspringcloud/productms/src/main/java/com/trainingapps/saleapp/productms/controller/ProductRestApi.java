package com.trainingapps.saleapp.productms.controller;

import com.trainingapps.saleapp.productms.dto.AddProductRequest;
import com.trainingapps.saleapp.productms.dto.ChangeProductRequest;
import com.trainingapps.saleapp.productms.dto.ProductDetails;
import com.trainingapps.saleapp.productms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductRestApi {

    @Autowired
    private IProductService service;

    // effect url   /products/byid/{id}
    //@RequestMapping(path="/{id}", method=RequestMethod.GET)
    @GetMapping("/byid/{id}")
    public ProductDetails getById(@PathVariable  long id) throws Exception {
        ProductDetails response = service.findProductDetailsById(id);
        return response;
    }


    // @RequestMapping( method=RequestMethod.GET)
    // effective url is /products
    @GetMapping
    public List<ProductDetails> getAllProducts() {
        List<ProductDetails> response = service.findAll();
        return response;
    }

    // @RequestMapping(path="/add", method=RequestMethod.POST)
    // effective url /products/add
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping(value = "/add")
    public ProductDetails addProduct(@RequestBody AddProductRequest requestData) {
        ProductDetails response = service.addProduct(requestData);
        return response;
    }

    @PutMapping("/price/change/{id}")
    public ProductDetails changePrice(@RequestBody  ChangeProductRequest requestData, @PathVariable  long id) throws Exception {
        ProductDetails response = service.changePrice(id, requestData);
        return response;
    }

    @DeleteMapping("/remove/byid/{id}")
    public String removeProduct(@PathVariable long id) throws Exception {
        service.deleteById(id);
        return id + " product deleted";
    }


}
