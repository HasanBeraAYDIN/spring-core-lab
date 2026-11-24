package com.hasko.springcorelab;

import com.hasko.springcorelab.ders2.OrderService;
import com.hasko.springcorelab.ders3.Counter;
import com.hasko.springcorelab.ders3.DatabaseConnection;
import com.hasko.springcorelab.ders3.PaymentClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreLabApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreLabApplication.class, args) ;

       context.getBean(OrderService.class).placeOrder("kitap");
       Counter c1 ,c2;
       c1 = context.getBean(Counter.class);
       c2 = context.getBean(Counter.class);
       System.out.println(c1.increment());
       System.out.println(c2.increment());
       System.out.println(c1.count == c2.count);
       context.getBean(DatabaseConnection.class);


       System.out.println("--------UYGULAMA KAPANIYOR!----------");
        PaymentClient p =context.getBean(PaymentClient.class);
        p.pay(100);
       context.close();
    }

}
