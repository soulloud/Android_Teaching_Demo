package com.bf.androiddemo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private LocalDate date;
    private double amount;
    private String merchant;
    private User userPaid;
    private List<User> userSpliting = new ArrayList<>();

    public Transaction(double amount, String merchant){
        this.date = LocalDate.now();
        this.amount = amount;
        this.merchant = merchant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }
}
