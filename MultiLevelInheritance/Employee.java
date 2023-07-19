package com.techlabs.inheritance;

//Multilevel Inheritance

public class Employee extends PersonForMultiLevel{
	private String eid;
	
	void setEmployee(String employeeID)
	{
		this.eid = employeeID;
	}
	
	void displayEmployee()
	{
		System.out.println("ID: "+eid);
	}
}
