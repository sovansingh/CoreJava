package com.app.program.number;

import java.util.Scanner;

public class PerfectSquareEx {

	public static String checkPerfectSquare(int num) {
		double d = Math.sqrt(num);
		
		if(d - (Math.floor(d)) == 0) {
			return "Perfect Square number : "+num;
		}else {
			return "Not a Perfect Square number : "+num;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			String str = PerfectSquareEx.checkPerfectSquare(num);
			System.out.println(str);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
