package ex4;

import java.util.Scanner;

//A passanger is travel from LN to Noida using metro/Bus
abstract class Vehical {
	public abstract void move(String s, String d);
}
class Bike extends Vehical {

	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using bike");
	}
}


class Bus extends Vehical {

	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using bus");
	}

}

class Metro extends Vehical{
	//SOLID: O:open close pri...
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using metro");
	}
}

class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Vehical vehical) {
		System.out.println("name of passanger :" + name);
		vehical.move(s, d);
	}
}

public class UseAExample {

	public static void main(String[] args) {
		System.out.println("choose the vehical0");
		System.out.println("1. for bike 2. for metro 3. from Bus");
		Scanner scanner=new Scanner(System.in);
		int choice= scanner.nextInt();
		Vehical vehical=null;
		
		if(choice==1) {
			vehical=new Bike();
		}else if(choice==2) {
			vehical=new Metro();
			
		}else if(choice==3) {
			vehical=new Bus();
		}
		
		Passanger passanger = new Passanger("raj");
		passanger.travel("laxmi nagar", "noida", vehical);
		
	}
}




