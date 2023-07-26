package com.trainingapps.productms;

import com.trainingapps.productms.frontend.FrontEnd;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApplication {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        FrontEnd frontEnd=context.getBean(FrontEnd.class);
        frontEnd.runUI();
    }
}
