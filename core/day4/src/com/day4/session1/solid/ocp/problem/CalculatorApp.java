package com.day4.session1.solid.ocp.problem;

interface Operate{
	public int apply(int a, int b);
}
class Add implements Operate{
	@Override
	public int apply(int a, int b) {
		return a+b;
	}	
}
class Multiply implements Operate{
	@Override
	public int apply(int a, int b) {
		return a*b;
	}	
}

class Cal{
	public static int operation(int a, int b, Operate operate) {
		return operate.apply(a, b);
	}
	
}
public class CalculatorApp {

	public static void main(String[] args) {
		
		Operate operate=new Add();
		
		int sum=Cal.operation(2, 3, operate);
		System.out.println(sum);
		
		
	}
}
