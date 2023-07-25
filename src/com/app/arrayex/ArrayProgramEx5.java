package com.app.arrayex;

public class ArrayProgramEx5 {

	public static void main(String[] args) {
		int[] arr = { 12, 32, 56, 98, 788, 52, 54, 52, 114, 456, 55, 54, 52, 114, 456, 55, 788, 52, 54, 52, 114, 456,
				12, 32, 56, 98, 788, 52, 54, 52, 114 };

//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//
//		int min = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);

		
		for (int i = 0; i < 3; i++) {
			int initial = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = initial;
		}

		System.out.println();
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
