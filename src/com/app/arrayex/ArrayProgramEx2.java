package com.app.arrayex;

public class ArrayProgramEx2 {

	public static void main(String[] args) {
		int[] arr = {12,32,56,98,788,52,54,52,114,456,55,54,52,114,456,55,788,52,54,52,114,456,12,32,56,98,788,52,54,52,114};
		
		int initial = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = initial;
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
