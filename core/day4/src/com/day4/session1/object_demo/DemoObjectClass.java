package com.day4.session1.object_demo;

public class DemoObjectClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee1=new Employee(1, "raj", 5000.00);
		Employee employee2=new Employee(1, "raj", 5000.00);
	
		//i want to make clone of employee1
		System.out.println(employee1);
		
		Employee employee3= (Employee) employee1.clone();
		
		System.out.println(employee3);
		
//		employee1=null;
//		
//		employee2=null;
//		System.out.println("-----------");
//		//u can do a polite req to gc (garbage collector) to collect unused objects
//		System.gc();
//		Runtime.getRuntime().gc();
//		
//		System.out.println("-----------");
		
		
		//equals methods vs ==
		//by defualt equals will not work => u have to override it
//		if(employee1.equals(employee2)) {
//			System.out.println("yes");
//		}else
//			System.out.println("false");
		
		//the use of toString is to print the state of the object
	//	System.out.println(employee);
	
		//hashcode method ?
	//	System.out.println(employee.hashCode());
		
		//getClass: fully qualified name of the class
	//	System.out.println(employee.getClass());
		
		
		
	}
}








