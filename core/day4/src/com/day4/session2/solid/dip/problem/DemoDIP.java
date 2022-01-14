package com.day4.session2.solid.dip.problem;

//shopping cart
interface Payable{
	public void processPayment();
}
class GooglePay implements Payable{
	public void processPayment() {
		System.out.println("payment is done using GooglePay");
	}
}

class DebitCard implements Payable{
	public void processPayment() {
		System.out.println("payment is done using debit card");
	}
}
class CreditCard implements Payable{
	public void processPayment() {
		System.out.println("payment is done using Credit card");
	}
}
class ShoppingCart{
	//abstraction banao.... :)
	private Payable payable;

	public ShoppingCart(Payable payable) {
		this.payable = payable;
	}

	public void checkOut() {
		payable.processPayment();
	}
}
public class DemoDIP {
	
	public static void main(String[] args) {
		Payable payable=new GooglePay();
		ShoppingCart cart=new ShoppingCart(payable);
		cart.checkOut();
	}

}



