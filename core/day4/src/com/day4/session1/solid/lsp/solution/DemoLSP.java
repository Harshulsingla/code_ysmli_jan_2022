package com.day4.session1.solid.lsp.solution;

class Rectangle {
	private int l, b;

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getArea() {
		return l * b;
	}

}

//here we are reusing the code using compostion => better technique as it is not a voilation of LSP
class Square {
	private Rectangle rectangle;

	public Square(int l) {
		rectangle = new Rectangle(l, l);
	}

	public int getArea() {
		return rectangle.getArea();
	}
	public void changeDimansion(int newDimension) {
		rectangle.setB(newDimension);
		rectangle.setL(newDimension);
	}
}

public class DemoLSP {
	public static void main(String[] args) {

		Square sq = new Square(4);
		System.out.println(sq.getArea());
		sq.changeDimansion(10);
		System.out.println(sq.getArea());
	}
}
