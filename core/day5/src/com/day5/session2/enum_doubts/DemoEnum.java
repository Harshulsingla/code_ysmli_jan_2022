package com.day5.session2.enum_doubts;
//38, 40 ,42 44 46

enum ShirtSize{
	S(30), M(40), L(42), XL(44), XXL(46);
	
	private int size;
	private ShirtSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	
	
}
class Shirt{
	private String color;
	private String brand;
	private double price;
	private ShirtSize size;
	public Shirt(String color, String brand, double price, ShirtSize size) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ShirtSize getSize() {
		return size;
	}
	public void setSize(ShirtSize size) {
		this.size = size;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shirt [color=").append(color).append(", brand=").append(brand).append(", price=").append(price)
				.append(", size=").append(size).append("]");
		return builder.toString();
	}
	
	
}
public class DemoEnum {
	
	public static void main(String[] args) {
		//enum is a special class whose purpose it to restruct the valid values for a data type
		
		Shirt shirt=new Shirt("light blue", "PE", 1200, ShirtSize.XL);
		System.out.println(shirt);
		
		ShirtSize shirtSize=shirt.getSize();
		System.out.println(shirtSize);
		System.out.println(shirtSize.ordinal());
		System.out.println(shirtSize.getSize());
	}

}
