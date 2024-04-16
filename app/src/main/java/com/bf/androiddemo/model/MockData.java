package com.bf.androiddemo.model;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    private static final List<Transaction> transactions = new ArrayList<>();

    static {
        transactions.add(new Transaction(50.0, "Online Store"));
        transactions.add(new Transaction(30.0, "Coffee Shop"));
        transactions.add(new Transaction(100.0, "Grocery"));
        transactions.add(new Transaction(75.0, "Clothing"));
        transactions.add(new Transaction(200.0, "Electronics"));
        transactions.add(new Transaction(20.0, "Gas Station"));
        transactions.add(new Transaction(150.0, "Restaurant"));
        transactions.add(new Transaction(80.0, "Bookstore"));
        transactions.add(new Transaction(60.0, "Hardware"));
        transactions.add(new Transaction(90.0, "Pharmacy"));
        transactions.add(new Transaction(40.0, "Movie"));
        transactions.add(new Transaction(5.0, "Fast Food"));

    }

    public static List<Transaction> getSampleData() {
        return transactions;
    }
}
