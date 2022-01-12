package ex1;

class Account {
	private int accountId;
	private String accountHolderName;
	private double balance;
	private static String bankName = "SBI";

	//constructor chaining? calling a ctr from a another ctr of same class
	public Account() {
		this(100,"foo",3000.00);
	}

	public Account(int accountId, String accountHolderName, double balance) {
		
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void printAccountDetails() {
		System.out.println("--------------");
		System.out.println("account id: " + accountId);
		System.out.println("accountHolderName: " + accountHolderName);
		System.out.println("balance: " + balance);
		System.out.println("--------------");
	}
}

public class DemoBasics {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.printAccountDetails();
		
		Account account2 = new Account(1, "raj", 4000.00);
		account2.printAccountDetails();
		
	}

}

//data: instance variable, static variable, local variable

//methods non static /static methods
//ctr
//getter(Immutatator) setter(mutatator)
//logic methods

//Coding convension: imp

//static {
//	System.out.println("it is static init block");
//}
//{
//	System.out.println("common code 1");
//}
//
//{
//	System.out.println("another common code 2");
//}
