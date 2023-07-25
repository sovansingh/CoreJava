package com.app.program.String;

public class DuplicateWordEx {

	public static void main(String[] args) {
		String str = "i will never give up. i will fighter for ever.";
//		System.out.println(str.length());
		String[] word = str.split(" ");
		String visited = "-1";
		for(int i=0;i<word.length-1;i++) {
			for(int j=i+1;i<word.length-1;j++) {
				if(word[i] == word[j]) {
					word[j] = visited;
				}
			}
		}
		for(int i=0;i<word.length-1;i++) {
			if(word[i] != "-1" && word[i] != ".") {
				System.out.println(word[i]+" ");
			}
		}
	}
}
