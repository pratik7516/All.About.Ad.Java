package com.cdac.comp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AccountLog {
	
	@Pointcut("execution(* com.cdac.dao.AccountDao.createAccount(..))")
	public void accPointCut1() {
		
	}
	
	@Before(value = "accPointCut1()")
	public void beforeCreateAcc() {
		System.out.println("before acc create");
	}
}
