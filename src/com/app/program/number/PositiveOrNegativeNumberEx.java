package com.app.program.number;

import java.util.Scanner;

public class PositiveOrNegativeNumberEx {

	public static String checkNumber(Long num) {
		if (num > 0) {
			return "positive number";
		} else if (num < 0) {
			return "Negative number";
		} else {
			return "Number is zero";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			System.out.println("Enter a number");
			scanner = new Scanner(System.in);
			Long num = scanner.nextLong();
			System.out.println(PositiveOrNegativeNumberEx.checkNumber(num));
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
