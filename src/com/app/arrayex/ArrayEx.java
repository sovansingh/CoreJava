package com.app.arrayex;

public class ArrayEx {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[1] = 4;
		a[2] = 5;
		a[3] = 6;
		a[4] = 7;
		a[5] = 8;
		a[6] = 49;
		
		int b[] = {3,4,5,6,7,8,9};
		
		int c[] = {33,55,63,725,8474,9,0,23};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i = 0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		for(int i : c) {
			System.out.print(i+ " ");
		}
	}
}
