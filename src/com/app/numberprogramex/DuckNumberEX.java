package com.app.numberprogramex;

import java.util.Scanner;

public class DuckNumberEX {

	public static boolean checkDuckNumber(int number) {
		while(number != 0) {
			if(number%10 == 0) 
				return true;
			number = number/10;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number.");
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			boolean result = DuckNumberEX.checkDuckNumber(i);
			if(result) {
				System.out.println("Duck number");
			}else {
				System.out.println("Not a Duck number");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
