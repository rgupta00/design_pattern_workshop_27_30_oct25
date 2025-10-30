package com.bankapp.service;

import org.springframework.stereotype.Service;

@Service
public class FraudService {
    public boolean validate(int from, int to, double amount) {
        System.out.println("Validating fraud for " + amount + " transfer...");
        return amount > 100000; // simple rule
    }
}