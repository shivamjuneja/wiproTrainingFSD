package com.trainingapps.didemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope("prototype")
@Component
public class Square implements IShape {


    @Value("${square.side}")
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("after square object is initialized, side=" + side);
    }

    @PreDestroy
    public void beforeDestroyed(){
        System.out.println("inside square, before object removed from from container");
    }
}
