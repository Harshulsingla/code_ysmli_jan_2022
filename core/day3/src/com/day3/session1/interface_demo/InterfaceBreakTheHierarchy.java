package com.day3.session1.interface_demo;

interface Jumpable {
	public void jump();
}

class Kid implements Jumpable {

	void goToOnlineTutionForIIT() {

	}

	@Override
	public void jump() {
		System.out.println("hey monkey dont think to beat me in jumping ");
	}

}

class Monkey implements Jumpable {
	void eatOnTree() {

	}

	void stayOnTree() {

	}

	@Override
	public void jump() {
		System.out.println("i jump like anything :)");
	}
}

public class InterfaceBreakTheHierarchy {

	public static void main(String[] args) {

	}
}
