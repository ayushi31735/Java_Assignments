package com.techlabs.inheritance;

//Hierarchical Inheritance

public class Account {
	private String name;
	private double accountNumber;
	
	void setAccount(String name, double accountNumber)
	{
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	void displayAccount()
	{
		System.out.println("Name: "+name);
		System.out.println("Account Number: "+accountNumber);
	}
}
