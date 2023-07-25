package com.app.inheritanceex;
class Employee{
	float salary = 4000;
}
class Programmer extends Employee{
	int bonus = 1000;
}
public class InheritanceEx extends Programmer{

	public static void main(String[] args) {
		InheritanceEx inheritanceEx = new InheritanceEx();
		System.out.println(inheritanceEx.bonus);
		System.out.println(inheritanceEx.salary);
	}
}
