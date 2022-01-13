package com.day4.session1.solid.ocp.problem;

//Open close princ...
//process the geo shape: Triangle, Circle, Square


class Triangle  {
	public void getArea() {
		System.out.println(" i am Triangle");
	}
}

class Circle  {
	public void getArea() {
		System.out.println(" i am Cicle");
	}
}

class Square  {
	public void getArea() {
		System.out.println(" i am Square");
	}
}


class ShapeProcessor {
	public void process(Object shape) {
		
		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.getArea();
		}
		else if (shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
			triangle.getArea();
		}
		else if (shape instanceof Square) {
			Square square=(Square) shape;
			((Square) shape).getArea();
		}
	}
}

public class DemoOcpProblem {

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
