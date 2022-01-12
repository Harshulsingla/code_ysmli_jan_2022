package com.day3.session1.inheritance;

class A {
	int i=9;
	static String a="raj";
	
	 static void foo() {
		System.out.println(a);
		System.out.println("foo of class A");
	}
}

class B extends A {
	//int i=33;
	static String a="rajiv";
	
	static void foo() {
		 System.out.println(a);
		System.out.println("foo of class B");
	}
}

public class DoubtOnOverriding {
	public static void main(String[] args) {
		A a=new B();
		a.foo();
	}

}
