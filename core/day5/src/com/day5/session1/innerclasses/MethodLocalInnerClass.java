package com.day5.session1.innerclasses;
class A{
	public void foo() {
		//method local inner class
		 class B{
			 //Cannot define static initializer in inner type B
//			static {	
//			}
			void foofB() {
				System.out.println("foofB...");
			}
		 }
		 B b=new B();
		 b.foofB();
	}
}
public class MethodLocalInnerClass {
	
	public static void main(String[] args) {
		A a=new A();
		a.foo();
	}

}
