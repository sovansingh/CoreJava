package com.app.program.String;

public class PermutationString {

	public static String swapString(String a,int start,int end) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[start];
		b[start] = b[end];
		b[end] = ch; 
		return String.valueOf(b);
	}
	
	public static void generatePermutation(String str,int start,int end) {
		if(start == end-1) {
			System.out.println(str);
		}else {
			for(int i=0;i<end;i++) {
				str = swapString(str,start,i);
			
				generatePermutation(str, start+1, end);
				
				str = swapString(str, start, i);
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abc";
		generatePermutation(str,0,str.length());
	}
}
