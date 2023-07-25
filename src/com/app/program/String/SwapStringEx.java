package com.app.program.String;

public class SwapStringEx {

	public String swapString(String str1,String str2) {
		str1 = str1.concat(str2);
		System.out.println("str1 : "+str1);
		str2 = str1.substring(0, str1.length()-str2.length());
		System.out.println("str2 : "+str2);
		str1 = str1.substring(str2.length(), str1.length());
		System.out.println("str1 : "+str1);
		return "str1 : "+str1+" and str2 : "+str2;
	}
	public static void main(String[] args) {
		String str1= "sovan";
		String str2 = "lipsa";
		
		SwapStringEx ex = new SwapStringEx();
		String s = ex.swapString(str1,str2);
	
		System.out.println(s);
	}
}
