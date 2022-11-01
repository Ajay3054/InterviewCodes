package com.java8.streamapi;

public class Student {

	private int studeId;
	private String studentName;
	
	
	public int getStudeId() {
		return studeId;
	}
	public void setStudeId(int studeId) {
		this.studeId = studeId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student(int studeId, String studentName) {
		super();
		this.studeId = studeId;
		this.studentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studeId=" + studeId + ", studentName=" + studentName + "]";
	}
	
	
	
	
	
	
}
