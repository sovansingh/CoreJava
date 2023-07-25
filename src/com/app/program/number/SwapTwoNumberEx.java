package com.app.program.number;

import java.util.Scanner;

public class SwapTwoNumberEx {

	public static String bitwiseSwap(int num1,int num2) {
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		return "First Number : "+num1+" Second Number : "+num2;
	}
	public static String addSwap(int num1,int num2) {
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		return "First Number : "+num1+" Second Number : "+num2;
	}
	public static String swapNumber(int num1,int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2  = temp;
		return "First Number : "+num1+" Second Number : "+num2;
	}
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter First Number");
			int num1 = scanner.nextInt();
			System.out.println("Enter Second Number");
			int num2 = scanner.nextInt();
			System.out.println(SwapTwoNumberEx.bitwiseSwap(num1,num2));
			System.out.println(SwapTwoNumberEx.addSwap(num1,num2));
			System.out.println(SwapTwoNumberEx.swapNumber(num1,num2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
