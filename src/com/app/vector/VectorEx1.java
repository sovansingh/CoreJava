package com.app.vector;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		vector.add(600);
		vector.add(700);
		vector.add(800);
		vector.add(900);
		vector.add(1000);
		vector.add(1100);

		for (Integer i : vector) {
			System.out.print(i + " ");
		}
		System.out.println();
		vector.remove((Integer)200);
		System.out.println(vector);
		vector.remove(4);
		System.out.println(vector);
		System.out.println(vector.hashCode());
		System.out.println(vector.get(1));
	}
}
