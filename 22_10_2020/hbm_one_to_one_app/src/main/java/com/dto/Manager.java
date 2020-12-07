package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "mgr")
public class Manager {
	@Id
	@Column(name = "mgr_id")
	private int mgrId;
	@Column(name = "mgr_name")
	private String mgrName;
	@OneToOne
	@JoinColumn(name = "dept_id",unique = true)
	private Department dept;
	public Manager() {

	}
	public Manager(int mgrId, String mgrName) {
		super();
		this.mgrId = mgrId;
		this.mgrName = mgrName;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return mgrId + " " + mgrName;
	}
	
}
