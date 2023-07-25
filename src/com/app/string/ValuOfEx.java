package com.app.string;

public class ValuOfEx {

	public static void main(String[] args) {
		int value = 30;
		String str = String.valueOf(value);
		System.out.println(str);
		System.out.println();
		
		boolean b = true;
		boolean c = false;
		
		String str1 = String.valueOf(b);
		String str2 = String.valueOf(c);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
	
		char d = 'c';
		char e = 'C';
		
		String str3 = String.valueOf(d);
		String str4 = String.valueOf(e);
	
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		float f = 10.3f;
		double g = 12.23;
		
		String str5 = String.valueOf(f);
		String str6 = String.valueOf(g);
	
		System.out.println(str5);
		System.out.println(str6);
		System.out.println();
		
		byte h = 11;
		short i = 56;
		long j = 99l;
		char[] k = {'h','f','d'};
		
		String o =String.valueOf(h);
		String n =String.valueOf(i);
		String m = String.valueOf(j);
		String l = String.valueOf(k);
		
		System.out.println(o);
		System.out.println(n);
		System.out.println(m);
		System.out.println(l);
	}
}
