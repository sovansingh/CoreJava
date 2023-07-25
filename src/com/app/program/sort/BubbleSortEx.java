package com.app.program.sort;

public class BubbleSortEx {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int temp = 0;
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {50,60,890,45,67,95,78};
		bubbleSort(arr);
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}
