package com.luxoft.bankapp.model;

public interface Account extends Report {
    void deposit(float amount);

    float getBalance();

    void withdraw(float amount);
}
