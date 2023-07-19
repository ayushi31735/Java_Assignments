package com.techlabs.inheritance;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setPerson("Isha", "Ranchi", "Female", 25);
		student.setStudent(10, "TYBE");
		student.displayPerson();
		student.displayStudent();
		System.out.println();
		
		/*Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = scanner.next();

		System.out.print("Enter Address: ");
		String address = scanner.next();

		System.out.print("Enter Gender: ");
		String gender = scanner.next();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();

		System.out.print("Enter Roll Number: ");
		int rollnumber = scanner.nextInt();

		System.out.print("Enter Class: ");
		String classname = scanner.next();

		Student student1 = new Student();
		student1.setPerson(name,address,gender,age);
		student1.setStudent(rollnumber,classname);
		student1.displayPerson();
		student1.displayStudent();*/
	}

}
