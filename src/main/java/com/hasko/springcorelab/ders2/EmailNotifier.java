package com.hasko.springcorelab.ders2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message){
        System.out.println("Email : " + message);
    }
}
