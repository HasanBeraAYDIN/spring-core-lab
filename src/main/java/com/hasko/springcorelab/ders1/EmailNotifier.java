package com.hasko.springcorelab.ders1;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message){
        System.out.println("Email : " + message);
    }
}
