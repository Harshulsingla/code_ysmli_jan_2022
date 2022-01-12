package a.c;

import a.b.*;

public class B extends A {

	public static void main(String[] args) {
		B b=new B();
		b.fooDeProtected();
		//b.fooDefault();
		System.out.println(b.k);
		
//		A a=new A();
//		
//		a.fooDeProtected();
		
		//a.fooDefault();
		
//		System.out.println(a.i);
//		a.fooPrivate();
	}
}
