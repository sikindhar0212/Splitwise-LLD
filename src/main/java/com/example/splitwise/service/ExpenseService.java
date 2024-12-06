package com.example.splitwise.service;

import com.example.splitwise.model.Expense;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private List<Expense> expenses = new ArrayList<>();

    public Expense addExpense(Expense expense) {
        expenses.add(expense);
        return expense;
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }
}