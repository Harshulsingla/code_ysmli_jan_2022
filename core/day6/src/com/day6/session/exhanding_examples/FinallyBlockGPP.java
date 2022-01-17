package com.day6.session.exhanding_examples;

public class FinallyBlockGPP {

	public static void main(String[] args) {
		//dont throws ex from finally block otherwise it will mask your exception
		try {
		myFinallyExceptions();
		
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		// never return vaules from finally block
		int value=myFinallyCode();
		System.out.println(value);
	}

	 static void myFinallyExceptions() {
		try {
			if(1==1) {
				throw new NullPointerException();
			}
		}finally {
			//throw new ArrayIndexOutOfBoundsException();
		}
	}

	//bad code
	 static int myFinallyCode() {
		try {
			//logic 
			return 1;
		}finally {
			//resouce closing code most of the time
			//return 0;
		}
	}
}
