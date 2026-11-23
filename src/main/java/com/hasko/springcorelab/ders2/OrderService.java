package com.hasko.springcorelab.ders2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    final private Notifier notifier;
    public OrderService(@Qualifier("smsNotifier") Notifier notifier){
        this.notifier=notifier;
    }
    public void placeOrder(String item){
        notifier.send(item + " sipariş alındı !");
    }
}
