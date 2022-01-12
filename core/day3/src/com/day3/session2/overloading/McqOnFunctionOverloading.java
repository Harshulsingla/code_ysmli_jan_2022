package com.day3.session2.overloading;
class MyFoo{
	public void foo(Object a) {
		System.out.println("public void foo(Object a)");
	}
	public void foo(Double a) {
		System.out.println("public void foo(double a)");
	}
}
public class McqOnFunctionOverloading {
	
	public static void main(String[] args) {
		MyFoo f=new MyFoo();
		f.foo(null);
	}

}
