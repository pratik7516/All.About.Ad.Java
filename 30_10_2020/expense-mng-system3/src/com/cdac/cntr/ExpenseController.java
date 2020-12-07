package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Expense;
import com.cdac.service.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@RequestMapping(value = "/prep_expense_add_form.htm",method = RequestMethod.GET)
	public String prepExpenseAddForm(ModelMap map) {
		map.put("expense", new Expense());
		return "expense_add_form";
	}
	
	@RequestMapping(value = "/expense_add.htm",method = RequestMethod.POST)
	public String expenseAdd(Expense expense) {
		expenseService.addExpense(expense);
		return "home";
	}
}
