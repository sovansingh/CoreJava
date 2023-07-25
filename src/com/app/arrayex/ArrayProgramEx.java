package com.app.arrayex;

public class ArrayProgramEx {

	public static void main(String[] args) {
		int[] arr = {12,25,52,36,699,89,78};
		int[] arr1 = new int[arr.length];
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		System.out.println();
		for(int a : arr1) {
			System.out.print(a+" ");
		}
	}
}
