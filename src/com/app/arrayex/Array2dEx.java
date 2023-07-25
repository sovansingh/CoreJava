package com.app.arrayex;

public class Array2dEx {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,60},{9,8,7}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
