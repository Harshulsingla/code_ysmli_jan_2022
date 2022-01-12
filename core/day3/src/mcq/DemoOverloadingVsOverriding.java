package mcq;
class A{
	
	void method(int i){
		System.out.println("base method ");
	}
}
class B extends A{
	
	void method(Integer i){
		System.out.println("overriden method ");
	}
	
}
public class DemoOverloadingVsOverriding {

	public static void main(String[] args) {
		A a=new B();
		a.method(22);
	}
}
