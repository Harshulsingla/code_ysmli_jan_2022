package ex1;

import java.lang.reflect.WildcardType;

//Writer is writing a story using blue colored reynold pen
class Pen{
	private String brand;
	private String color;
	
	public Pen(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	public void write() {
		System.out.println("it is pen of "+ brand + " brand of color "+ color );
	}
	
}
class Writer{
	public void writeAStrory(Pen pen) {
		System.out.println("an great idea of story in my mind let me pen it...");
		pen.write();
	}
}
public class DemoUseA {

	public static void main(String[] args) {
		Pen pen=new Pen("rey", "blue");
		Writer ravi=new Writer();
		ravi.writeAStrory(pen);
	}
}
