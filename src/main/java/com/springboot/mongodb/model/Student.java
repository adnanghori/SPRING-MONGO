package com.springboot.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
	
	private int studentId;
	private String studentName;
	private String studentCity;
	private String studentSchool;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentCity, String studentSchool) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentSchool = studentSchool;
	}
	public int getId() {
		return studentId;
	}
	public void setId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentSchool() {
		return studentSchool;
	}
	public void setStudentSchool(String studentSchool) {
		this.studentSchool = studentSchool;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentSchool=" + studentSchool + "]";
	}
	
}
