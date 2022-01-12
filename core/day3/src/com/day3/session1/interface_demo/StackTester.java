package com.day3.session1.interface_demo;

public class StackTester {

	public static void main(String[] args) {
		Stack stack=new StackRavi();
		stack.push(22);
		stack.push(2);
		stack.push(292);
		stack.push(97);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
