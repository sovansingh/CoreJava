package com.app.statement;

public class ControleStatementEx1 {

	public static void main(String[] args) {
		String city = "delhi";
		
		if(city == "agra") {
			System.out.println("City is agra");
		}else if (city == "Noida") {
			System.out.println("City is Noida");
		}else if (city == "Bhubaneswar") {
			System.out.println("City is Bhubaneswar");
		}else {
			System.out.println(city);
		}
	}
}
