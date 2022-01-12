package ex4;

import java.util.Scanner;

abstract class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	abstract  void printArea() ;

}

class Square extends Shape {
	public Square(String color) {
		super(color);
	}

	public void printArea() {
		System.out.println("area of Square: l*b");
	}

}

class Circle extends Shape {
	public Circle(String color) {
		super(color);
	}

	public void printArea() {
		System.out.println("area of Circle:pi * r * r");
	}

}

class Triangle extends Shape {
	public Triangle(String color) {
		super(color);
	}

	public void printArea() {
		System.out.println("area of Triangle 1/2 * b * h");
	}

}

public class DemoShapExample {
	public static void main(String[] args) {

		System.out.println("choose the vehical0");
		System.out.println("1. for cirlce 2. for Square 3. for Tri");
		Scanner scanner=new Scanner(System.in);
		int choice= scanner.nextInt();
		
		Shape shape=null;
		if(choice==1) {
			shape=new Circle("red");
		}else if(choice==2) {
			shape=new Square("red");
		}else if(choice==3) {
			shape=new Triangle("red");
		}
		
		shape.printArea();
	}

}



