package com.app.statement;

public class IfElseIfStatemntEx1 {

	public static void main(String[] args) {
		int num = -13;
		
		if(num >0) {
			System.out.println("positive number");
		}else if(num < 0){
			System.out.println("Negative number");
		}else {
			System.err.println("Zero");
		}
	}
}
