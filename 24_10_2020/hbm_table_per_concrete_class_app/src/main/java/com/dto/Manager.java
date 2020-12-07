package com.dto;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "mgr_inh2")
public class Manager extends Employee {
	
	private float ta;
	private float da;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int empId, String empName, float salary, float ta, float da) {
		super(empId, empName, salary);
		this.ta = ta;
		this.da = da;
	}

	public float getTa() {
		return ta;
	}
	public void setTa(float ta) {
		this.ta = ta;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}

	@Override
	public String toString() {
		return super.toString()+" " + ta + " " + da;
	}
	
}
