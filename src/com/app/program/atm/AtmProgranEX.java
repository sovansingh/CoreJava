package com.app.program.atm;

import java.util.Scanner;

public class AtmProgranEX {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int depositeAmount = 0,withdrawAmount = 0;
			int balance=1000;
			while(true) {
				System.out.println("Enter a option betwwwn below links.");
				System.out.println("click 1 for deposite.");
				System.out.println("Click 2 for withdraw.");
				System.out.println("Click 3 for balance check.");
				System.out.println("Click 4 for exit.");
				System.out.println();
				int option = scanner.nextInt();
				
				switch (option) {
				case 1:
					System.out.println("Enter the amount for deposite.");
					depositeAmount = scanner.nextInt();
					balance +=depositeAmount;
					System.out.println("Amount deposited successfully.");
					break;
				case 2:
					System.out.println("Enter the amount for withdraw.");
					withdrawAmount = scanner.nextInt();
					if(balance >= withdrawAmount) {
						balance -=withdrawAmount;	
						System.out.println("Amount withdraw : "+withdrawAmount);
					}else {
						System.out.println("Insuffient balance");
					}
					
					break;
				case 3:
					System.out.println("Your available balance is : "+balance);
					break;
				case 4:
					System.out.println("Thank you for using the ATM.");
					System.exit(0);
				default:
					break;
				}
				
				
			}
		}
		
	}
}
