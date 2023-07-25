package com.app.arrayex;

public class ArrayEx2 {

	public static void printArray(int[] a) {
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		printArray(new int[] {23,43,55,67,89,9,10});
	}
}
