package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conn.MyConn;
import com.dto.Expense;

public class ExpenseDaoImple implements ExpenseDao {
	
	private MyConn myConn;
	
	public ExpenseDaoImple() {
		myConn = new MyConn();
	}

	@Override
	public int insertExpense(Expense expense) {
		int i = 0;
		try {
		Connection con = myConn.getConn();
		PreparedStatement s = con.prepareStatement("insert into expense(item_name, price, pur_date, user_id) values(?,?,?,?)");
		s.setString(1, expense.getItemName());
		s.setFloat(2, expense.getPrice());
		s.setString(3, expense.getPurchaseDate());
		s.setInt(4, expense.getUserId());
		i = s.executeUpdate();
		s.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateExpense(Expense expense) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteExpense(int expenseId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Expense> selectAll(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense getExpense(int expenseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
