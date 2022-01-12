package ex2;
//init block

class Account{
	private int id;
	private String name;
	
	private double balance;
	
	private static double totalFund;
	//static init block
	static {
		//use db connection
		totalFund=55.88;
		
		System.out.println("only one");
	}
	//init block
	{
		System.out.println("it is a common code 2");
	}
	{
		System.out.println("it is a common code");
	}
	
	public Account(int id, String name, double balance) {
		System.out.println("para ctr");
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		System.out.println("default ctr");
	}
	
	
	public void print() {
		System.out.println("id: "+ id+ " name : "+ name + " balance : "+ balance);
	}
	
}
public class DemoStaticInitBlock {

	public static void main(String[] args) {
		Account account=new Account(1, "raj", 5000.00);
		System.out.println("--------------");
		Account account2=new Account();
		
		
	}
}
