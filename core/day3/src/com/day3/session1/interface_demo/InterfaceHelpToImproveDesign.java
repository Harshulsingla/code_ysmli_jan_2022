package com.day3.session1.interface_demo;
//seprate what varies

interface Swimmable{
	void swimming();
}
interface Flyable{
	void flying();
}
class Bird{
	void eat() {
		System.out.println("eating ...");
	}
}
class Duck extends Bird implements Swimmable{
	@Override
	public void swimming() {
		System.out.println("i am God of Swimming...");
	}	
}
class Eagle extends Bird implements Flyable{
	public void flying() {
		System.out.println("Goddish flying ...");
	}
	
}
class Emu extends Bird{
	
}
public class InterfaceHelpToImproveDesign {
	public static void main(String[] args) {
		//SOLID : LSP
		Bird bird=new Eagle();
		((Flyable) bird).flying();
		
	}
}
