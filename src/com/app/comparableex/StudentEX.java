package com.app.comparableex;

public class StudentEX implements Comparable<StudentEX>{

	int rollno;
	String name;
	int age;
	public StudentEX(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(StudentEX st) {
		if(age == st.age) {
			return 0;
		}
		else if (age < st.age) {
			return 1;
		}else{
			return -1;
		}
	}
	@Override
	public String toString() {
		return "StudentEX [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
