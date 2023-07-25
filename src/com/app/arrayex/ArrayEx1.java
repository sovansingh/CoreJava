package com.app.arrayex;

public class ArrayEx1 {

	public static void min(int[] a) {
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);		
	}

	public static void main(String[] args) {
		int[] a = { 22, 32, 43, 34, 56, 73, 12 };

		min(a);
	}
}
