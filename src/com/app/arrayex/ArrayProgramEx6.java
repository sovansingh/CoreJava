package com.app.arrayex;

public class ArrayProgramEx6 {

	public static void main(String[] args) {
		int[] arr = { 12, 32, 56, 98, 788, 52, 54, 52, 114, 456, 55, 54, 52, 114, 456, 55, 788, 52, 54, 52, 114, 456,
				12, 32, 56, 98, 788, 52, 54, 52, 114 };
		int[] temp = new int[arr.length];
		int j =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		
		for(int i : temp) {
			System.out.println(i+" ");
		}
	}
}
