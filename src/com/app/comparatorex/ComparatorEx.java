package com.app.comparatorex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {
		List<StudentEx> list = new ArrayList<StudentEx>();
		list.add(new StudentEx(1, "ss1", 15));
		list.add(new StudentEx(2, "ss2", 25));
		list.add(new StudentEx(3, "ss3", 35));
		list.add(new StudentEx(4, "ss4", 45));
		list.add(new StudentEx(5, "ss5", 55));
		list.add(new StudentEx(6, "ss6", 65));
		list.add(new StudentEx(7, "ss7", 75));
		list.add(new StudentEx(8, "ss8", 85));
	
		Collections.sort(list,new NameComparator());
		
		Iterator<StudentEx> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
