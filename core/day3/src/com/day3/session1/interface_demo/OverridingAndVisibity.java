package com.day3.session1.interface_demo;

class A1 {
	 void foo() {
		System.out.println("foo method of class A");
	}
}

class B1 extends A1 {
	@Override
	 public void foo() {
		System.out.println("foo method of class B");
	}
}

public class OverridingAndVisibity {

	public static void main(String[] args) {
		A1 a=new B1();
		a.foo();
	}
}
