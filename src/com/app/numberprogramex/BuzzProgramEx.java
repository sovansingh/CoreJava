package com.app.numberprogramex;

import java.util.Scanner;

public class BuzzProgramEx {

	public static void main(String[] args) {
		System.out.println("Enter a number.");
		Scanner scanner=null;
		try {
			scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			String number = String.valueOf(i);
			if(number.endsWith("7")) {
				System.out.println("Given number is buzz number.");
			}else {
				if(i%2 == 0) {
					System.out.println("Given number is buzz number.");
				}else {
					System.out.println("Not a buzz number.");
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
