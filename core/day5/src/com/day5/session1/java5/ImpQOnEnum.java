package com.day5.session1.java5;

//enum objects are created eagerly
enum Foo{
	A("INR"),B("USD"),C("URO");
	private Foo(String currCode){
		System.out.println("hello "+ currCode);
	}
	private String currCode;

}
public class ImpQOnEnum {
	
	public static void main(String[] args) {
		Foo f=Foo.A;
		
	}

}
