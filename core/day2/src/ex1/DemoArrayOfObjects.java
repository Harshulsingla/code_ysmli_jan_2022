package ex1;

//class
//java have 4 visiblity modifier: public , protected , default , private 
class Part {
	private int id; // instance varibale
	private String name;
	private double price;
	private static String brand = "ymsli";// class variable

	Part() {
		System.out.println("it a defulat ctr");
	}
	
	public static void printBrandName() {
		System.out.println(brand);
	}
	
	public Part(Part part) {
		this.id=part.id;
		this.name=part.name;
		this.price=part.price;
	}
	

	public Part(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// " this is not avaiable to static meothd "

	public void print() {
		System.out.println(
				"part id: " + this.id + "name : " + this.name + " price : " + this.price + " brand: " + this.brand);
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public static String getBrand() {
//		return brand;
//	}
//	public static void setBrand(String brand) {
//		Part.brand = brand;
//	}
//	
//	
//	
	// setter , getter, mutator

	// ctr
	// logic methods

}

class Inventory{
	private static final int PARTS_SIZE=10;
	private String inventroyName;
	private Part[]parts;
	
	public Inventory(String inventroyName) {
		this.inventroyName=inventroyName;
		parts=new Part[PARTS_SIZE]; 
	}
	private int counter=0;
	
	public void addPart(Part part) {
		counter++;
		if(counter==PARTS_SIZE) {
			System.out.println("can not add more items...");
			return ;
		}
		parts[counter]=part;
	}
	
	public Part[]getAllParts(){
		return parts;
	}
	
}
public class DemoArrayOfObjects {

	public static void main(String[] args) {
		Part part = new Part(12, "bike struts", 4500.00);

		Part part2 = new Part(120, "head light", 1500.00);
		// "this is implicit pointer"
		part.print();
		part2.print();

		Part.printBrandName();
		
	}
}



