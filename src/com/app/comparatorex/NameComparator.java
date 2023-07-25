package com.app.comparatorex;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentEx>{

	@Override
	public int compare(StudentEx o1, StudentEx o2) {
		return o1.name.compareTo(o2.name);
	}

}
