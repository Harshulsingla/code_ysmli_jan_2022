package com.day4.session1.interface_abs;

public class PaymentSystem {

	public static void processPayment(Payable payable) {
		//process the payment of the person
		double pay=payable.pay();
		System.out.println("payment is processed : "+ pay);
		//put into db...
		//
	}
}
