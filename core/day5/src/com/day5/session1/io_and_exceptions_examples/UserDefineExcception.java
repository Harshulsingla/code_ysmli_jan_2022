package com.day5.session1.io_and_exceptions_examples;

import static java.lang.Math.*;

//Circle 
//1. u create a user define ex class
class NegativeRadiusException extends Exception {

	public NegativeRadiusException(String message) {
		super(message);
	}
	
}

class Circle {
	private int radius;

	public Circle(int radius) throws NegativeRadiusException {
		if (radius <= 0) {
			throw new NegativeRadiusException("-ve radius of "+ radius + " is not allowed");
		}
		this.radius = radius;
	}

	public void printArea() {
		System.out.println(PI * radius * radius);
	}
}

public class UserDefineExcception {
	public static void main(String[] args) {
		try {
			Circle circle = new Circle(-20);
			circle.printArea();
		} catch (NegativeRadiusException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
