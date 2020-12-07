package com.dto;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emp_comp_pk")
public class Employee {
	@Id
	private EmployeePk empPk;
	@Column(name = "basic_salary")
	private float basicSalary;
	private String dept;
	@Column(name = "join_date")
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	
	public Employee() {
		
	}
	
	public Employee(EmployeePk empPk, float basicSalary, String dept, Date joinDate) {
		super();
		this.empPk = empPk;
		this.basicSalary = basicSalary;
		this.dept = dept;
		this.joinDate = joinDate;
	}

	public EmployeePk getEmpPk() {
		return empPk;
	}

	public void setEmpPk(EmployeePk empPk) {
		this.empPk = empPk;
	}

	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		return empPk + " " + basicSalary + " " + dept
				+ " " + joinDate;
	}
	
}
