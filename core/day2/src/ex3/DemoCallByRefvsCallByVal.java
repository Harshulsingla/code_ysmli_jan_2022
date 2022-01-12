package ex3;
//call by value vs call by reference
class Val{
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Val() {}

	public Val(int x) {
		this.x = x;
	}
	
	
}
public class DemoCallByRefvsCallByVal {

	public static void main(String[] args) {
		Val v1=new Val(22);
		
		Val v2=new Val(20);
		System.out.println(v1.getX());
		myMethod(v1);
		System.out.println(v1.getX());
		
//		System.out.println("v1 : "+ v1.getX()+ " v2: "+ v2.getX());
//		swap(v1, v2);
//		System.out.println("v1 : "+ v1.getX()+ " v2: "+ v2.getX());
//		
		
	}

	public static  void myMethod(final  Val val) {
		//val=new Val(4444);
		val.setX(val.getX()+20);;
		
	}
	private static void swap(Val i, Val j) {
		Val temp=i;
		i=j;
		j=temp;
	}
}




