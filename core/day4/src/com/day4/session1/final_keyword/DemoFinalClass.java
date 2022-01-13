package com.day4.session1.final_keyword;
import java.util.*;
//final variable for reference: aka constant : const

 class Foo{
	class Bar{}
}
class Product{
	private int id;
	private double price;
	
	public Product(int id, double price) {
		this.id = id;
		this.price = price;
	}
	
	public void print() {
		System.out.println("id: "+ id+" price: "+ price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
//final :private vs ref
class Cart{
	private ArrayList<Product> products=new ArrayList<Product>();
	
	//final variable aka const
//	public void addToCart(final double price) {
//		price=6;
//	}
//	//final ref: constant pointer: only poiner is const "NOT THE VALUE POINTED BY ID"
//	public void addToCart( final Product product) {
//		product=null;
//		//U CAN STILL CHANGE STATE OF THE OBJECT
//		product.setPrice(product.getPrice()*0.9);
//		products.add(product);
//	}
}

//final variable : aka constant : const
//
//class ImpClass{
//	private  final int x=10;//instance variable, each object would have differnt copy of it
//	private static final int y=10;//static variable, each object would share same variable
//	
//	void foo() {
//		System.out.println("i am foo of Imp class"+ x++);
//	}
//	
//}





//subtituablity: overriding is not possible for final method

//class ImpClass{
//	void foo() {
//		System.out.println("i am foo of Imp class");
//	}
//	
//	final void bar() {
//		System.out.println("i am bar of Imp class");
//	}
//}
//
//class MyClass extends ImpClass{
//	void bar() {
//		System.out.println("i am bar of Imp class overriden");
//	}
//}


//final class ImpClass{
//	void foo() {
//		System.out.println("i am foo of Imp class");
//	}
//}
////we can reuse but can not extends final class
//
//class MyClass {
//	private ImpClass class1=new ImpClass();
//	
//	public void myLogic() {
//		class1.foo();
//	}
//}
public class DemoFinalClass {
	
	public static void main(String[] args) {
		
	}

}
