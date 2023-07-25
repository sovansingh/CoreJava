package com.app.arrayex;

public class ArrayProgramEx4 {

	public static void main(String[] args) {
		int[] arr =  { 12, 32, 56, 98, 788, 52, 54, 52, 114, 456, 55, 54, 52, 114, 456, 55, 788, 52, 54, 52, 114, 456,
				12, 32, 56, 98, 788, 52, 54, 52, 114 };
		int count = 0;
//		for(int i : arr) {
//			System.out.print(i+ " ");
//			count++;
//		}
//		System.out.println();
//		System.out.println(count);
//		
//		count=0;
//		for(int i = arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//			count++;
//		}
//		System.out.println();
//		System.out.println(count);
	
		for(int i=0;i<arr.length;i=i+2){
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.println();

		System.out.println(count);
		count=0;
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		
	}
}
