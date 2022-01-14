package com.day5.session1.io_and_exceptions_examples.ex2;

public class Stack {

	private int arr[];
	private int top;
	private final int SIZE=5;
	
	public Stack() {
		arr=new int[SIZE];
		top =-1;
	}
	
	public void push(int data) throws StackOverflowException{
		if(top==SIZE-1) {
			throw new StackOverflowException("stack is full can not insert "+ data +" ");
		}else {
			arr[++top]=data;
		}
	}
	public int pop() {
		if(top==-1) {
			throw new StackEmptyException("stack is empty");
		}else {
			return arr[top--];
		}
	}

	
}
