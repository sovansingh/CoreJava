package com.app.stringbuffer;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("lipsa");
		stringBuffer.append("sovan");
		System.out.println(stringBuffer);
		stringBuffer.insert(5, " love's ");
		System.out.println(stringBuffer);
		stringBuffer.replace(12, 18, " someone else. ");
		System.out.println(stringBuffer);
		stringBuffer.delete(12, 26);
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.capacity());
		stringBuffer.ensureCapacity(50);
		System.out.println(stringBuffer.capacity());
	}
}
