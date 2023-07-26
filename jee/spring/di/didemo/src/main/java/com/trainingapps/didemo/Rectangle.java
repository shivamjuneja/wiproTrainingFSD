package com.trainingapps.didemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Rectangle implements IShape{
    @Value("${rect.len}")
    private int length;
    @Value("${rect.breadth}")
    private int breadth;


    public Rectangle(){

    }

    public Rectangle(int len, int breadth){
        this.length = len;
        this.breadth=breadth;
    }

    @Override
    public int area() {
        return length*breadth;
    }
}
