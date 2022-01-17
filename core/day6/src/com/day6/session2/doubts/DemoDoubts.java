package com.day6.session2.doubts;
class X{
	X(){
		System.out.println("class X ctr");
	}
	public void fooX() {
		System.out.println("foo of X class");
	}
}
class A{
	private static X x;
	
	static {
		System.out.println("init block");
	     x=new X();
	}
	public void foo() {
		System.out.println("foo of class A");
		x.fooX();
	}
}
public class DemoDoubts {
	
	static {
		A a=new A();
		a.foo();
	}
	
}
