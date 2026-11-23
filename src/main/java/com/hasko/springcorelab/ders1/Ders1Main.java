package com.hasko.springcorelab.ders1;

public class Ders1Main {
    public static void main(String[] args) {
        OrderServiceV1 v1 = new OrderServiceV1();
        OrderServiceV2 v2Email =new OrderServiceV2(new EmailNotifier());
        OrderServiceV2 v2Sms = new OrderServiceV2(new SmsNotifier());
        v1.placeOrder("laptop");
        v2Email.placeOrder("telefon");
        v2Sms.placeOrder("ayakkabı");



    }
}
