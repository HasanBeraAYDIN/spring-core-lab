package com.hasko.springcorelab.ders3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
    public PaymentClient paymentClient(){
    PaymentClient p = new PaymentClient("https://api.odeme.com");
    return p;
}
}
