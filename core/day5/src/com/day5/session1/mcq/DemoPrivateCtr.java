package com.day5.session1.mcq;
//trick: u need to concept of "static": in order to call static method we dont need to create object
//Singleton Design pattern *
class MyClass{
	private static MyClass class1=new MyClass();
	
	public static MyClass getMyClass() {
		return class1;
	}
	private MyClass() {
		System.out.println("dare to call me");
	}
}

public class DemoPrivateCtr {
	public static void main(String[] args) {
		
		MyClass class1=MyClass.getMyClass();
		System.out.println(class1.hashCode());
		
		MyClass class2=MyClass.getMyClass();
		System.out.println(class1.hashCode());
		
		
	}

}
