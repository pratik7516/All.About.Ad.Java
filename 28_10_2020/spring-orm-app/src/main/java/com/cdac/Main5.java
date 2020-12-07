package com.cdac;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dto.Expense;
import com.cdac.service.ExpenseService;

public class Main5 {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		ExpenseService es = appCntx.getBean(ExpenseService.class);
		List<Expense> l = es.expenseList(2);
		for(Expense expense : l) {
			System.out.println(expense);
		}
	}

}
