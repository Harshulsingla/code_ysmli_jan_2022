package com.day5.session1.mcq;
class Mammal{
}
public class Person extends Mammal {
	public String name;

	public static void main(String str[]) {
		Mammal p = new Person();
		System.out.print(p instanceof Mammal);
	}
}