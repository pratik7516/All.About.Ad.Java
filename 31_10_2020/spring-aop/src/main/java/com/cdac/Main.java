package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dao.AccountDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		
		AccountDao dao = (AccountDao)appCntx.getBean(AccountDao.class);
		dao.createAccount();
	}

}
