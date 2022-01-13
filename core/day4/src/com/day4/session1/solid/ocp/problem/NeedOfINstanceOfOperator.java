package com.day4.session1.solid.ocp.problem;
//What is instanceOf operator
class Animal{
	void sound() {
		System.out.println("sound...");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("bho bho...");
	}
    void nightWatchmanShip() {
    	System.out.println("protect from bad elements ....");
    }
}
class Cat extends Animal{
	void sound() {
		System.out.println("meoun.....");
	}
}

public class NeedOfINstanceOfOperator {

	public static void main(String[] args) {
		Animal [] animals= {new Dog(), new Cat(), new Dog()};
		
		for(Animal animal: animals) {
			animal.sound();
			if(animal instanceof Dog)
			((Dog) animal).nightWatchmanShip();
		}
	}
}
