package com.app.comparableex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

	public static void main(String[] args) {
		List<StudentEX> list = new ArrayList<StudentEX>();
		list.add(new StudentEX(1, "sovan singh", 10));
		list.add(new StudentEX(2, "sovan1 singh", 20));
		list.add(new StudentEX(3, "sovan2 singh", 30));
		list.add(new StudentEX(4, "sovan3 singh", 40));
		list.add(new StudentEX(5, "sovan4 singh", 50));
		
		Collections.sort(list);
		
		for(StudentEX ex : list) {
			System.out.println(ex);
		}
	}
}
