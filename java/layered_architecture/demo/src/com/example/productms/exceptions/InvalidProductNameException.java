package com.example.productms.exceptions;

public class InvalidProductNameException extends RuntimeException{
    public InvalidProductNameException(String msg) {
        super(msg);
    }
}
