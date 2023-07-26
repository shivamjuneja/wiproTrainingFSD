package com.trainingapps.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(App.class,args);

        Square square1 = context.getBean(Square.class);
        System.out.println("square area=" + square1.area());

        Square square2 = context.getBean("square", Square.class);
        boolean isSame = square1 == square2;
        System.out.println("is same=" + isSame);
        //context.close();
        System.out.println("bye");


    }
}
