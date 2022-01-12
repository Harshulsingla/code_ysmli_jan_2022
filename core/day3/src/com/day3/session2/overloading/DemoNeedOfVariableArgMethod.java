package com.day3.session2.overloading;
class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add( int ...a) {
		//System.out.println(b);
		int sum=0;
		for(int i=0;i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
public class DemoNeedOfVariableArgMethod {
	
	public static void main(String[] args) {
		
		
		Calculator calculator=new Calculator();
		int sum=calculator.add(3,5,6);
		
		System.out.println(sum);
	}

}
