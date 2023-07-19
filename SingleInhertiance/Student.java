package com.techlabs.inheritance;

public class Student extends Person {
	int rollnumber;
	String classname;
	
	void setStudent(int rollnumber, String classname)
	{
		this.rollnumber = rollnumber;
		this.classname = classname;
	}
	
	void displayStudent()
	{
		System.out.println("Roll Number: "+rollnumber);
		System.out.println("Class: "+classname);
	}
}
