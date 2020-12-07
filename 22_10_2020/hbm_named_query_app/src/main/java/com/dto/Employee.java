package com.dto;


import java.util.Date;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emp")
@NamedQueries({
	@NamedQuery(name = "selAll",query="from Employee")
})
@NamedNativeQueries({
	@NamedNativeQuery(name = "selAll1",query = "select * from emp",resultClass = Employee.class)
})
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "basic_salary")
	private float basicSalary;
	private String dept;
	@Column(name = "join_date")
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	
	public Employee() {
		
	}
	
	public Employee(int empId) {
				this.empId = empId;
	}

	public Employee(int empId, String empName, float basicSalary, String dept, Date joinDate) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.dept = dept;
		this.joinDate = joinDate;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
		return empId + " " + empName + " " + basicSalary + " " + dept
				+ " " + joinDate;
	}
	
}
