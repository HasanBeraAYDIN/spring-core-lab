package com.hasko.springcorelab.ders1;

public class OrderServiceV1 {
    private Notifier notifier = new EmailNotifier();
    public void placeOrder(String item){
        notifier.send(item + " sipariş alındı ! ");
    }
}
