package com.hasko.springcorelab;

import com.hasko.springcorelab.ders2.OrderService;
import com.hasko.springcorelab.ders3.Counter;
import com.hasko.springcorelab.ders3.DatabaseConnection;
import com.hasko.springcorelab.ders3.PaymentClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreLabApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreLabApplication.class, args);


    }

}
