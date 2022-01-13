package com.day4.session1.solid.ocp.solution;

//Open close princ...
//process the geo shape: Triangle, Circle, Square

//design as per interface !

abstract class Shape{
	public abstract void getArea() ;
}
class Triangle extends Shape {
	public void getArea() {
		System.out.println(" i am Triangle");
	}
}

class Circle  extends Shape {
	public void getArea() {
		System.out.println(" i am Cicle");
	}
}

class Square  extends Shape {
	public void getArea() {
		System.out.println(" i am Square");
	}
}


class Rectangle  extends Shape {
	public void getArea() {
		System.out.println(" i am Rectangle");
	}
}

class ShapeProcessor {
	//open for extension but close for modification
	public void process(Shape shape) {
		shape.getArea();
	}
}

public class DemoOcpSolution {

	public static void main(String[] args) {
		// instanceof act at run time tell me whether a object is compatable to a
		// particular class not?

//		Circle circle=new Circle();
//		
//		if(circle instanceof Triangle) {
//			System.out.println("yes");
//		}else
//			System.out.println("no");
	}

}
