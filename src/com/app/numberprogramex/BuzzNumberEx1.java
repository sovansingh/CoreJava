package com.app.numberprogramex;

import java.util.Scanner;

public class BuzzNumberEx1 {

	public boolean chechNumber(int number) {
		if(number%10 ==7 || number/7 == 0) {
			return true;
		}else {
			return false;	
		}
	}

	public static void main(String[] args) {
		BuzzNumberEx1 buzzNumber = new BuzzNumberEx1();
		Scanner scanner =null;
		try {
			System.out.println("Enter a number");
			scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			boolean result = buzzNumber.chechNumber(i);
			if(result) {
				System.out.println("Given number is buzz number.");
			}else {
				System.out.println("Given number is not buzz number.");
			}
			System.out.println("");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
