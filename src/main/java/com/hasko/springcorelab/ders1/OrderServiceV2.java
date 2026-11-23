package com.hasko.springcorelab.ders1;

public class OrderServiceV2 {
    final private Notifier notifier;
    public OrderServiceV2(Notifier notifier){
        this.notifier=notifier;
    }
    public void placeOrder(String item){
        notifier.send(item + " sipariş alındı !");
    }
}
