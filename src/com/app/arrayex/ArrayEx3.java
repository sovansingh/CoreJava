package com.app.arrayex;

public class ArrayEx3 {

	public static int[] get() {
		return new int[] {1,54,5,69,88,753,6};
	}
	public static void main(String[] args) {
		int arr[] = get();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
