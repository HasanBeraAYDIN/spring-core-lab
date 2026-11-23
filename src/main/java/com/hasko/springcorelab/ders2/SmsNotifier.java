package com.hasko.springcorelab.ders2;

import org.springframework.stereotype.Component;

@Component
public class SmsNotifier implements Notifier {
    @Override
    public void send(String message){
        System.out.println("SMS : " + message);
    }
}
