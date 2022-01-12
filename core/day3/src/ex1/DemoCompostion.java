package ex1;
//Building<>------Flat
class Flat{
	private String flatNumber;
	private String ownerName;
	private double price;
	
	public Flat(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printFlatDetails() {
		System.out.println("-------------");
		System.out.println("flatNumber: "+ flatNumber);
		System.out.println("ownerName: "+ ownerName);
		System.out.println("price: "+ price);
		System.out.println("-------------");
	}
}

class Building{
	private String buildingName;
	private String buildingLocation;

	private Flat flat;
	public void addFlat(String ownerName, double price ) {
		flat=new Flat("1434");
		flat.setOwnerName(ownerName);
		flat.setPrice(price);
	}
	public void getFlatDetails(String flatNumber) {
		flat.printFlatDetails();
		System.out.println("buildingName: "+ buildingName);
		System.out.println("buildingLocation: "+ buildingLocation);
	}
	
	//it will spoil our composition concept :(
//	public Flat getFlat() {
//		return flat;
//	}
}


public class DemoCompostion {

	public static void main(String[] args) {
		
		Building building=new Building();
		
		building.addFlat("anil", 55.9);
		
		//Flat flat=building.getFlat();
		
		building=null;
		//flat.printFlatDetails();
		
	}
}
