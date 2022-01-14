package com.day5.session1.innerclasses;

class MyOuter{
	
	static private int i=99;
	static void foofMyOuter() {
		
	}
	//used as helper class
	 static class MyInner{
		void foof() {
			foofMyOuter();
			System.out.println(i);
			System.out.println("foof method ....");
		}
	}
}

public class DemoNestedStaticClass {

	public static void main(String[] args) {
		
		MyOuter.MyInner in=new MyOuter.MyInner();
		in.foof();
	}
}
