package com.cdac.dto;

public class Expense {
	private int expenseId;
	private String itemName;
	private float price;
	private String purchaseDate;
	private int userId;
	public Expense() {
		
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
