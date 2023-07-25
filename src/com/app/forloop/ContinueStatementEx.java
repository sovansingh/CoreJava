package com.app.forloop;

public class ContinueStatementEx {

	public static void main(String[] args) {
		for(int i=0;i<=2;i++) {
			for(int j=i;j<=10;j++) {
				if(j==4) {
					continue;
				}
				System.out.println(j);
			}
		}
	}
}
