package com.app.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("aa");
		vector.add("aa1");
		vector.add("aa2");
		vector.add("aa3");
		vector.add("aa4");
		vector.add("aa5");
		vector.add("aa6");
		vector.add("aa7");
		
		Iterator<String> iterator = vector.iterator();
	
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println();
		vector.addElement("bb1");
		vector.addElement("bb12");
		vector.addElement("bb13");
		vector.addElement("bb14");
		vector.addElement("bb15");
		vector.addElement("bb16");
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		System.out.println(vector);
		System.out.println();
		if(vector.contains("bb1")) {
			System.out.println(vector.indexOf("bb1"));
		}
		
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
	}
}
