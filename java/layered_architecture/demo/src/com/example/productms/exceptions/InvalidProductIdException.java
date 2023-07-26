package com.example.productms.exceptions;

public class InvalidProductIdException extends RuntimeException{
    public InvalidProductIdException(String msg){
        super(msg);
    }
}
