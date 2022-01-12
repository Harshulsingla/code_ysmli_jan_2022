package ex4;

class A{
	private int i;
	
	A(int i){
		System.out.println("ctr of base class");
		this.i=i;
	}
	
}
class B extends A{
	private int j;
	B(int i, int j){
		super(i);
		System.out.println("ctr of drived class");
	}
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		B b=new B(3,5);
		
	}
}





