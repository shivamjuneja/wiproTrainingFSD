package com.stackroute.newz.controller;

import com.stackroute.newz.util.exception.NewsAlreadyExistsException;
import com.stackroute.newz.util.exception.NewsNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(NewsAlreadyExistsException.class)
    public String handleNewsAlreadyExist(NewsAlreadyExistsException e){
        return "news already exist for this id";
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NewsNotExistsException.class)
    public String handleNewsAlreadyExist(NewsNotExistsException e){
        return "news doesn't exist ";
    }


}
