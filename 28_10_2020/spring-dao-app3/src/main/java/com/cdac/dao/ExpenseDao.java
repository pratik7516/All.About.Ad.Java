package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Expense;

public interface ExpenseDao {
	void insertExpense(Expense expense);
	void deleteExpense(int expenseId);
	Expense selectExpense(int expenseId);
	void updateExpense(Expense expense);
	List<Expense> selectAll(int userId);
}
