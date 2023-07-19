package com.techlabs.inheritance;

//Multilevel Inheritance

public class PersonForMultiLevel {
	private String name;
	private String address;
	
	void setPerson(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	void displayPerson()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
