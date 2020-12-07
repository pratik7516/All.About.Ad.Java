package com.service;

import java.util.ArrayList;

import com.dto.Expense;

public interface ExpenseService {
	int addExpense(Expense expense);
	int modifyExpense(Expense expense);
	int removeExpense(int expenseId);
	ArrayList<Expense> expenseList(int userId);
	Expense findExpense(int expenseId);
}
