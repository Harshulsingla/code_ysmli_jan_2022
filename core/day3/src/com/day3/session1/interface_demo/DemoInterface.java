package com.day3.session1.interface_demo;
//interface act as a contract bw two parties,loose coupling

//it also solve the diamond problem

//interface A{
//	public static final  int i=0;//public static and final can not have instance variable
//	//A(){} u can not have ct
//	//u can only declare the method u can not define it
//	public  abstract void foo();//all method are public and abstract
//	
//}

interface A {
	
	public static final int i = 7;

	public abstract void foo();
}

interface B {
	public static final int i = 77;

	public abstract void foo();
}

class C implements A, B {

	@Override
	public void foo() {
		System.out.println(B.i);
	}

}

public class DemoInterface {

	public static void main(String[] args) {

	}
}
