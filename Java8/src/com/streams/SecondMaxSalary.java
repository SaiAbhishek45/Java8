package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMaxSalary {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("Alice", "Engineering", 95000),
				new Employee("Bob", "Engineering", 87000), new Employee("Charlie", "HR", 65000),
				new Employee("David", "Engineering", 99000), new Employee("Eve", "Marketing", 72000));

		Comparator<Employee> comparator = (e1, e2) -> Long.compare(e2.salary, e1.salary);

		Comparator<Employee> comparator1 = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o2.salary - o1.salary);
			}
		};

		Employee employee = list.stream().filter(e -> e.department.equals("Engineering")).sorted(comparator).distinct()
				.skip(1).findFirst().get();

		System.out.println(employee);
	}

}
