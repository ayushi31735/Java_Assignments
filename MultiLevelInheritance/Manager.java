package com.techlabs.inheritance;

//Multilevel Inheritance

public class Manager extends Employee{
	private double salary;
	
	void setManager(double salary)
	{
		this.salary = salary;
	}
	
	void displayManager()
	{
		System.out.println("Salary: "+salary);
	}
}
