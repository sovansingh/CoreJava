package com.app.statement;

public class IfExample2 {

	public static void main(String[] args) {
		int year = 2020;
		
		if((year%4 == 0) && (year%100 != 0) || (year%400==0)) {
			System.out.println("Leaf year");
		}else {
			System.out.println("Common Year");
		}
	}
}
