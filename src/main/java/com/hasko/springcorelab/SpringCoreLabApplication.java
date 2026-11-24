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

        // Ders 2: DI
        context.getBean(OrderService.class).placeOrder("kitap");

        // Ders 3: scope (Counter prototype -> her getBean yeni nesne)
        Counter c1 = context.getBean(Counter.class);
        Counter c2 = context.getBean(Counter.class);
        System.out.println(c1.increment());
        System.out.println(c2.increment());
        System.out.println("Ayni nesne mi? " + (c1 == c2));

        // Ders 3: lifecycle (singleton -> @PreDestroy close() sirasinda calisir)
        context.getBean(DatabaseConnection.class);

        // Ders 3: @Configuration + @Bean
        PaymentClient p = context.getBean(PaymentClient.class);
        p.pay(100);

        System.out.println("--------UYGULAMA KAPANIYOR!----------");
        context.close();
    }

}
