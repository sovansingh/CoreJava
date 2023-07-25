package com.app.arrayex;

public class ThrirdLargestNumberEx {

	public static void main(String[] args) {
		int[] arr = {22,55,69,68,54,52,15,35,77};
		for(int i=0;i<arr.length;i++) {
			int temp;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[i]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}
}
