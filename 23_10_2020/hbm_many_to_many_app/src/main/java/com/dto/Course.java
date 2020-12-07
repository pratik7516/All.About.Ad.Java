package com.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "course_no")
	private int courseNo;
	@Column(name = "course_name")
	private String courseName;
	@ManyToMany
	@JoinTable(name = "course_subject",joinColumns = {@JoinColumn(name="course_no")},inverseJoinColumns = {@JoinColumn(name="subject_no")}) 
	private Set<Subject> subjects = new HashSet<Subject>();
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseNo, String courseName) {
		super();
		this.courseNo = courseNo;
		this.courseName = courseName;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return courseNo + " " + courseName;
	}
	
	
}
