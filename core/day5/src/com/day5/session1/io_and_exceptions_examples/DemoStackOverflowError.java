package com.day5.session1.io_and_exceptions_examples;

class Foo{
	public void foof() {
		foof();
	}
}
public class DemoStackOverflowError {
	
	public static void main(String[] args) {
		try{
			Foo f=new Foo();
			f.foof();
			
			//Never ever try to handle error ...try to remove bad code
		}catch(Exception e) {
			System.out.println("done");
		}
	
	}

}
