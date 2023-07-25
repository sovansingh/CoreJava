package com.app.program.number;

import java.util.Scanner;

public class LargestNumberEx {

	public int checkLargestNumber(int num1, int num2, int num3) {
		int temp = num1 > num2 ? num1 : num2;
		return temp > num3 ? temp : num3;
	}

	public static void main(String[] args) {
		Scanner scanner = null;
		LargestNumberEx ex = new LargestNumberEx();
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter First Number");
			int num1 = scanner.nextInt();
			System.out.println("Enter Second Number");
			int num2 = scanner.nextInt();
			System.out.println("Enter Third Number");
			int num3 = scanner.nextInt();
			int str = ex.checkLargestNumber(num1, num2, num3);
			System.out.println("Largest NUmber : "+str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
