package com.techlabs.inheritance;

//Multilevel Inheritance

import java.util.Scanner;

public class TestManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = scanner.next();
		
		System.out.print("Enter Address: ");
		String address = scanner.next();
		
		System.out.print("Enter ID: ");
		String eid = scanner.next();
		
		System.out.print("Enter Salary: ");
		double salary = scanner.nextDouble();
		
		Manager manager = new Manager();
		manager.setPerson(name, address);
		manager.setEmployee(eid);
		manager.setManager(salary);
		
		manager.displayPerson();
		manager.displayEmployee();
		manager.displayManager();
	}

}
