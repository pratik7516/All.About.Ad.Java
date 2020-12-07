package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Expense;

@Repository
public class ExpenseDaoImple implements ExpenseDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertExpense(Expense expense) {
		
		String q = "insert into expense(item_name,price,pur_date,user_id) values(?,?,?,?)";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {expense.getItemName(),expense.getPrice(),expense.getPurchaseDate(),expense.getUserId()});
		System.out.println("done");
	}

	public void deleteExpense(int expenseId) {
		String q = "delete from expense where expense_id = ?";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {expenseId});
		System.out.println("done");
		
	}

	public Expense selectExpense(int expenseId) {
		List<Expense> list = jdbcTemplate.query("select * from expense where expense_id = ?", new Object[] {expenseId}, new RowMapper<Expense>() {

			public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
				Expense expense = new Expense();
				expense.setExpenseId(rs.getInt("expense_id"));
				expense.setItemName(rs.getString("item_name"));
				expense.setPrice(rs.getFloat("price"));
				expense.setPurchaseDate(rs.getString("pur_date"));
				expense.setUserId(rs.getInt("user_id"));
				return expense;
			}
			
		} );
		return list.get(0); 
	}

	public void updateExpense(Expense expense) {
		String q = "update expense set item_name = ?, price = ?, pur_date = ? where expense_id = ?";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {expense.getItemName(),expense.getPrice(),expense.getPurchaseDate(),expense.getExpenseId()});
		System.out.println("done");
		
	}

	public List<Expense> selectAll(int userId) {
		List<Expense> list = jdbcTemplate.query("select * from expense where user_id = ?", new Object[] {userId}, new RowMapper<Expense>() {

			public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
				Expense expense = new Expense();
				expense.setExpenseId(rs.getInt("expense_id"));
				expense.setItemName(rs.getString("item_name"));
				expense.setPrice(rs.getFloat("price"));
				expense.setPurchaseDate(rs.getString("pur_date"));
				expense.setUserId(rs.getInt("user_id"));
				return expense;
			}
			
		} );
		return list;
	}

	
}
