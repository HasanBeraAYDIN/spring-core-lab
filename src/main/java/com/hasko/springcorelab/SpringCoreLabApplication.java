package com.hasko.springcorelab;

import com.hasko.springcorelab.ders2.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreLabApplication {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(SpringCoreLabApplication.class, args) ;
       context.getBean(OrderService.class).placeOrder("kitap");
    }

}
