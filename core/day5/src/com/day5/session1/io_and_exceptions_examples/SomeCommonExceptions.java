package com.day5.session1.io_and_exceptions_examples;
import com.day5.session1.io_and_exceptions_examples.ex2.Stack;

abstract class Animal{
	public abstract void sound() ;
}
class Dog extends Animal{
	public void sound() {
		System.out.println("bho bho...");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("meou...");
	}
}

public class SomeCommonExceptions {
	
	public static void main(String[] args) {
		
		//ArrayStoreException

		Animal dogs[]=new Dog[2];
		
		dogs[0]=new Dog();
		dogs[1]=new Dog();
		
	
		myMethod(dogs);
		
//		
//		dogs[2].sound();
		
//		Dog dogs[]=new Dog[2];
//		
//		for(Dog dog: dogs) {
//			dog.sound();
//		}
		
		//NullPointerEx
		
		//Stack s=null;
		//s.push(33);
		
	}

	 static void myMethod(Animal[] animals) {
		 animals[0]=new Cat();
		 System.out.println("==done===");
	}

}
