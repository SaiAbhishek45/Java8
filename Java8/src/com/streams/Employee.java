package com.streams;

public class Employee {

	String name;
	String department;
	long salary;

	public Employee(String name, String department, long salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}
