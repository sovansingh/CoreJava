package com.app.base64;

import java.util.Base64;

public class Base64Ex {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		byte byteArr1[] = {1,2};
		byte byteArr2[] = encoder.encode(byteArr1);
		System.out.println("Encoded byte Array : "+byteArr2);
	}
}
