package com.app.comparatorex;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentEx>{

	@Override
	public int compare(StudentEx o1, StudentEx o2) {

		if(o1.age == o2.age) {
			return 0;
		}else if (o1.age < o2.age) {
			return 1;
		}else {
			return -1;
		}
	}

}
