package com.day6.session.exhanding_examples;
class MyBusinessException extends RuntimeException{
	public MyBusinessException(Throwable cause) {
		super(cause);
	}
}
public class ThrowingExFromCatchBlock {
	public static void main(String[] args) {
		
		myMethod();	
	}

	 static void myMethod() {
		 try {
				int i, j , k;
				i=12;
				j=0;
				k=i/j;
				System.out.println(k);
			}catch(ArithmeticException ex) {
				throw new MyBusinessException(ex);
			}
	}
}
