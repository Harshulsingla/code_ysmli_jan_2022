package com.day4.session1.interface_abs;

public class Employee implements Payable{
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
	public double pay() {
		return salary - 0.1*salary;//just 90%
	}
	public void printEmpDetails() {
		System.out.println("emp id: "+ id +" name : "+ name +" salary : "+ salary);
	}
}
