package com.app.program.String;

public class MaxMinStringEx1 {

	public static void main(String[] args) {
	
		String str = "great place to work and using latest technologies.";
		str = str.replace(" ","");
		char[] ch = str.toCharArray();
		char maxChar = ch[0];
		char minChar = ch[0];
		char visited = '0';
		int[] freq = new int[str.length()];

		for(int i=0;i<ch.length;i++) {
			freq[i] = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j] && ch[i] != visited && ch[j] != visited) {
					freq[i]++;
					ch[j] = visited;
				}
			}
		}
		for(int i : freq) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(char s : ch) {
			System.out.print(s+ " ");
		}
		System.out.println();
		int min=freq[0];
		int max = freq[0];
		for(int i=0;i<ch.length;i++) {
			if(max < freq[i] && freq[i] != '0') {
				max = freq[i];
				maxChar = ch[i];
				
			}
			if(min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = ch[i];
			}

		}
		System.out.println(max +" "+ maxChar);
		System.out.println(min +" "+ minChar);
		
	}
}
