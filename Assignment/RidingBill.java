package com.techlab.intro;

import java.util.Scanner;

public class RidingBill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height");
		int height = scanner.nextInt();
		int totalBill = 0;
		if(height < 120)
		{
			System.out.println("Can't Ride");
			return;
		}
			
		System.out.println("Enter Your Age");
		int age = scanner.nextInt();
		if(age > 55)
			System.out.println("Can't Ride");
		else
		{
			if(age < 12)
			{
				totalBill = 5;
			}
			else if(age>=12 && age<18)
			{
				totalBill = 7;
			}
			else if(age>=18 && age<45)
			{
				totalBill = 12;
			}
			else if(age>=45 && age<=55)
			{
				totalBill = 0;
			}
			System.out.println("Want Photos?");
			String photo = scanner.next();
			if(photo.equalsIgnoreCase("No"))
			{
				System.out.println("Total Bill = "+totalBill);
			}
			else
			{
				totalBill = totalBill+3;
				System.out.println("Total Bill = "+totalBill);
			}
				
		}
	}

}
