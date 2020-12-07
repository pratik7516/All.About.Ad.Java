package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dto.Expense;
import com.cdac.service.ExpenseService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		ExpenseService es = appCntx.getBean(ExpenseService.class);
		Expense expense = new Expense("fan", 9090.90f, "2020-10-10", 2);
		es.addExpense(expense);
	}

}
