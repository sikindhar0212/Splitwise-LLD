package com.example.splitwise.model;

import java.util.List;

public class Expense {
    private Long id;
    private double amount;
    private User paidBy;
    private List<User> splitBetween;

    // Constructors
    public Expense() {}

    public Expense(Long id, double amount, User paidBy, List<User> splitBetween) {
        this.id = id;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitBetween = splitBetween;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public User getPaidBy() {
        return paidBy;
    }
    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }
    public List<User> getSplitBetween() {
        return splitBetween;
    }
    public void setSplitBetween(List<User> splitBetween) {
        this.splitBetween = splitBetween;
    }
}