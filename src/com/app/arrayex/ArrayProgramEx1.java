package com.app.arrayex;

public class ArrayProgramEx1 {

	public static void main(String[] args) {
		int[] arr = {12,32,56,98,788,52,54,52,114,456,55,54,52,114,456,55,788,52,54,52,114,456,12,32,56,98,788,52,54,52,114};
		int visited = -1;
		int[] occurance = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = visited;
					count++;
				}
			}
			occurance[i] = count;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != visited) {
				System.out.print(arr[i]+" "+occurance[i]);
			}
			System.out.println();
		}
	}
}
