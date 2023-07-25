package com.app.program.sort;

public class SelectionSortEx {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
		
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallIndex = arr[index];
			arr[index] = arr[i];
			arr[i] = smallIndex;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 22, 65, 48, 96, 87, 75, 25 };

		selectionSort(arr);
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}
