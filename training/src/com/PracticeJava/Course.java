package com.PracticeJava;

import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	int courseCode;
	List<Student1> enrolledStudents = new ArrayList<>();
	
	public void enrollStudent(Student1 student) {
		enrolledStudents.add(student);		
	} 
	public void displayInfo() {
		System.out.println("Course Class DisplayInfo");
		
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setEnrolledStudents(List<Student1> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	public List<Student1> getEnrolledStudents() {
		return enrolledStudents;
	}
	
	


}
