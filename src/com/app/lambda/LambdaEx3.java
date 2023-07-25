package com.app.lambda;
@FunctionalInterface
interface Addable{
	int add(int a,int b);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		Addable addable1 = (a,b) -> {return a+b;};
		int result1 = addable1.add(1, 3);
		System.out.println(result1);
		
		Addable addable2 = (a,b) -> {return a+b;};
		int result2 = addable2.add(54, 85);
		System.out.println(result2);
	}
}
