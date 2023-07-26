package com.trainingapps.saleapp.productms.controller;

import com.trainingapps.saleapp.productms.exceptions.InvalidPriceException;
import com.trainingapps.saleapp.productms.exceptions.InvalidProductIdException;
import com.trainingapps.saleapp.productms.exceptions.InvalidProductNameException;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


@RestControllerAdvice
public class CentralizedExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductNotFound(ProductNotFoundException e) {
        System.out.println("*** inside handleProductNotFound"+e.getMessage());
        String msg = e.getMessage();
        return msg;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            InvalidPriceException.class,
            InvalidProductNameException.class,
            InvalidProductIdException.class,
            ConstraintViolationException.class,
            MethodArgumentNotValidException.class
    })
    public String handleInvalid(Exception e) {
        String msg = e.getMessage();
        return msg;
    }


}
