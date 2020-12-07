package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class Expense {
	@Id
	@GeneratedValue
	@Column(name = "expense_id")
	private int expenseId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "price")
	private float price;
	@Column(name = "purchase_date")
	private String purchaseDate;
	private int userId;
	
	public Expense() {
		
	}
	
	public Expense(int expenseId) {
		super();
		this.expenseId = expenseId;
	}

	public Expense(String itemName, float price, String purchaseDate,int userId) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.purchaseDate = purchaseDate;
		this.userId = userId;
	}
	
	public Expense(int expenseId, String itemName, float price, String purchaseDate) {
		super();
		this.expenseId = expenseId;
		this.itemName = itemName;
		this.price = price;
		this.purchaseDate = purchaseDate;
		
	}
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return expenseId + " " + itemName + " " + price + " "
				+ purchaseDate;
	}
	
	
}
