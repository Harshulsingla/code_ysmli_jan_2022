package com.day4.session1.solid.lsp.problem;

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

class Square extends Rectangle{
   private int l;
   public Square(int l) {
	   super(l, l);
   }
	public int getArea() {
		return super.getArea();
	}
}
public class DemoLSP {
	public static void main(String[] args) {

		Square sq=new Square(4);
		System.out.println(sq.getArea());
		sq.setB(10);
		System.out.println(sq.getArea());
	}
}
