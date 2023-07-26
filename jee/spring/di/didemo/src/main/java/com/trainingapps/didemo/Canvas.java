package com.trainingapps.didemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Canvas {


    @Autowired
    private IShape shape;

    public IShape getShape(){
        return shape;
    }

    public Canvas(){
        System.out.println("inside zero arg Canvas ctr ");
    }

    public Canvas(IShape shape) {
        this.shape = shape;
    }


    public void drawShape() {
        int area = shape.area();
        System.out.println("shape injected is "+shape.getClass().getName());
        System.out.println("drawing shape of area=" + area);
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("after canvas object is initialized, shape area=" + shape.area());
    }
    @PreDestroy
    public void beforeDestroyed(){
        System.out.println("inside canvas, before object removed from from container");
    }

}
