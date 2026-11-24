package com.hasko.springcorelab.ders3;

public class PaymentClient {
    private final String apiUrl;

    public PaymentClient(String apiUrl) {
        this.apiUrl = apiUrl;
        System.out.println("PaymentClient oluşturuldu: "+apiUrl);
    }
    public void pay(int amount){
        System.out.println(amount + " TL odendi ! ");
    }
}
