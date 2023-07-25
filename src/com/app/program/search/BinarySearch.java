package com.app.program.search;

public class BinarySearch {

	public static void binarySearch(int[] arr,int first,int last,int key) {
		
		int mid = (first+last)/2;
		while(first <= last) {
			if(arr[mid] < key) {
				first = mid+1;
			}else if (arr[mid] == key) {
				System.out.println("Element fount at the index of :"+mid);
				break;
			}else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first > last) {
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		int[] i = {50,40,30,20,10};
		int key = 40;
		int length = i.length-1;
		binarySearch(i,0,length,key);
	}
}
