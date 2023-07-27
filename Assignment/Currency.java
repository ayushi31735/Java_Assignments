package com.techlab.intro;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = scanner.nextInt();
		if(amount > 50000)
		{
			System.out.println("Amount exceeds withdrwal limit of 50000");
			return;
		}
		else
		{
			if(amount % 100 != 0)
			{
				System.out.println("Amount should be in multiples of 100");
				return;
			}
			else
			{
				if(amount >= 2000)
				{
					int note =  amount/2000;
					amount = amount%2000;
					System.out.println("Two Thousand: "+note);
				}
				if(amount >= 500)
				{
					int note =  amount/500;
					amount = amount%500;
					System.out.println("Five Hundred: "+note);
				}
				if(amount >= 200)
				{
					int note =  amount/200;
					amount = amount%200;
					System.out.println("Two Hundred: "+note);
				}
				if(amount >= 100)
				{
					int note =  amount/100;
					amount = amount%100;
					System.out.println("One Hundred: "+note);
				}
			}
		}
	}
}
