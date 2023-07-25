package com.app.forloop;

public class BreakStatementEx1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 20; j++) {
				for (int k = 0; k <= 15; k++) {
					System.out.println(k);
					if (k == 6) {
						break;
					}
				}
			}
		}
	}
}
