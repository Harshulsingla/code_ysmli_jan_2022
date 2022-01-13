package com.day4.session1.object_demo;

public class Employee extends Object implements Cloneable{
	private int id;
	private String name;
	
	private double salary;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double pay() {
		return salary - 0.1*salary;//just 90%
	}
	@Override
	public String toString() {
		return "id : "+ id + " name : "+ name +" salary : "+ salary;
	}

	//*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	//employee1.equals(employee2)
	//employee1=this
	
	//Object obj=employee2; //upcasting ho gaye hey
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj; //downcasting karna hey
		
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	//this method is actually now a days deprecated : must not be used
	@Override
	protected void finalize() throws Throwable {
		//to write the clean up code
		//db connection close => memory leak?
		System.out.println("finilized is called...");
	}

	
	
	
}

