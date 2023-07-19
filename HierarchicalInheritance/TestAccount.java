package com.techlabs.hierarchicalinheritance;

import java.util.Random;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which Type of account?? (Saving/Current).....");
		String typeOfAccount = scanner.next();
		
		if(typeOfAccount.equalsIgnoreCase("Saving"))
		{
			savingAccount(scanner);
		}
		
		if(typeOfAccount.equalsIgnoreCase("Current"))
		{
			currentAccount(scanner);
		}
		
		System.out.println("Invalid.......");
	}
	
	public static void currentAccount(Scanner scanner) {
		System.out.print("Enter Name: ");
		String name = scanner.next();
		
		//System.out.print("Enter Account Number: ");
		//long accountNumber = scanner.nextLong();
		
		long accountNumber = generateAccountNumber();
		
		System.out.print("Enter Rate Of Interest: ");
		double rateOfInterest = scanner.nextDouble();
		
		System.out.println("Details of Current Account.......");
		
		CurrentAccount currentaccount = new CurrentAccount();
		
		currentaccount.setAccount(name, accountNumber);
		currentaccount.setCurrentAccount(rateOfInterest);
		
		currentaccount.displayAccount();
		currentaccount.displayCurrentAccount();
		
		System.exit(0);
	}

	public static void savingAccount(Scanner scanner) {
		System.out.print("Enter Name: ");
		String name = scanner.next();
		
		//System.out.print("Enter Account Number: ");
		//long accountNumber = scanner.nextLong();
		
		long accountNumber = generateAccountNumber();
		
		System.out.print("Enter Balance: ");
		double balance = scanner.nextDouble();
		
		System.out.println("Details of Saving Account.......");
		
		SavingAccount savingaccount = new SavingAccount();
		
		savingaccount.setAccount(name, accountNumber);
		savingaccount.setSavingAccount(balance);
		
		savingaccount.displayAccount();
		savingaccount.displaySavingAccount();
		
		System.exit(0);
	}
	
	public static long generateAccountNumber() {
		
		Random random = new Random();
		
		long accountNumber = random.nextLong();
		return accountNumber;
		
	}

}
