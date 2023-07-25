package com.app.program.number;

public class EvenOddNumberEx {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i%2 == 0) {
				System.out.print("Even Number : "+i);
			}else {
				System.out.print("Odd Number : "+i);
			}
			System.out.println();
		}
	}
}
