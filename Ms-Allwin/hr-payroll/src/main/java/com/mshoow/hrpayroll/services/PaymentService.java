package com.mshoow.hrpayroll.services;

import com.mshoow.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }



}
