package com.day5.session1.innerclasses;
/*
 * 1. u can craete object either inside a method of outer class
 * 	or
 * 	outside
 * 2. that method must not be static
 */
class Outer {
	
	public Outer(int i) {
		
	}
	 class Inner{
		
		public Inner() {
			super();
		}
		void foof() {
			System.out.println("foof method inside inner class...");
		}
	}
	//static method ke pass this nahi hota hey
	public  void foofOuter() {
		
		System.out.println("hello ...");
	}
}
public class DemoTopLevelInnerClass {
	
	public static void main(String[] args) {
		
		//Outer.Inner in=new Outer().new Inner();
		//in.foof();
		
//		Outer outer=new Outer();
//		outer.foofOuter();
		
	}

}
