package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dto.Expense;
import com.cdac.service.ExpenseService;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		ExpenseService es = appCntx.getBean(ExpenseService.class);
		es.removeExpense(2);
	}

}
