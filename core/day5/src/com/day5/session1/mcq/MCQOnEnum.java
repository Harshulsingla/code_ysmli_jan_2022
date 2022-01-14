package com.day5.session1.mcq;
class A{
	
}
interface Foof{
	void foof();
}

enum Foo implements Foof{
	A, B;
	private  Foo() {
		System.out.println("ctr of enum");
	}

	@Override
	public void foof() {
		System.out.println("foof function");
	}
}

public class MCQOnEnum {

	public static void main(java.lang.String[] args) {
		Foo f=Foo.A;
		f.foof();
	}
}
