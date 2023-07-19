package com.techlabs.inheritance;

public class Person {
	private String name;
	private String address;
	private String gender;
	private int age;
	
	void setPerson(String name, String address,String gender, int age)
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	
	/*private void setPerson(String name, String address,String gender, int age)
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}*/
	
	void displayPerson()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
	}
}
