package com.app.comparatorex;

public class StudentEx {

	int rollno;
	String name;
	int age;

	public StudentEx(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentEx [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
