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

	@Override
	public void addExpense(Expense expense) {
		expenseDao.insertExpense(expense);
	}

	@Override
	public void removeExpense(int expenseId) {
		expenseDao.deleteExpense(expenseId);
	}

	@Override
	public Expense findExpenxe(int expenseId) {
		return expenseDao.selectExpenxe(expenseId);
	}

	@Override
	public void modifyExpense(Expense expense) {
		expenseDao.updateExpense(expense);
	}

	@Override
	public List<Expense> selectAll(int userId) {
		return expenseDao.selectAll(userId);
	}

}
