package com.example.springrest.throwingExceptions;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }

    public PaymentDetails processPayment2(){
        throw new IncorrectCurrencyException();
    }
}
