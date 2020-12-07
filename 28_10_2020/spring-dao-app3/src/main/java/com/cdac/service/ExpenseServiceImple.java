package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.ExpenseDao;
import com.cdac.dto.Expense;

@Service
public class ExpenseServiceImple implements ExpenseService {
	
	@Autowired
	private ExpenseDao expenseDao;

	public void addExpense(Expense expense) {
		expenseDao.insertExpense(expense);
	}

	public void removeExpense(int expenseId) {
		expenseDao.deleteExpense(expenseId);
	}

	public Expense findExpense(int expenseId) {
		return expenseDao.selectExpense(expenseId);
	}

	public void modifyExpense(Expense expense) {
		expenseDao.updateExpense(expense);
	}

	public List<Expense> expenseList(int userId) {
		return expenseDao.selectAll(userId); 
	}
	

}
