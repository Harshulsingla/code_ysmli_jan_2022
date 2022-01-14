package com.day4.session2.string_demo;

public class Employee {
	private int id;
	private String name;
	
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id)
		.append(", name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}

	
	
}
