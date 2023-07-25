package com.app.program.String;

public class StringFrequencyEx {

	public static void main(String[] args) {
		String str = "Picture Perfect";
		char[] ch =str.toCharArray();
		char visited = '1';
		int[] s = new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			int count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = visited;
				}
			}
			if(count >= 1) {
				s[i] = count;
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != visited && ch[i] != ' ') {
				System.out.println(ch[i]+" "+s[i]);
			}
		}
	}
}
