package com.hasko.springcorelab.ders3;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    public DatabaseConnection(){
        System.out.println("1 constructor ! ");
    }
    @PostConstruct
    public void init(){
        System.out.println("2 baglanti acildi ! ");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("3 baglanti kapatildi ! ");
    }
}
