package com.day4.session1.interface_abs;
//Employee class , payment system

public class Demo {

	public static void main(String[] args) {
		Employee employee=new Employee(1, "raj", 50000.00);
		PaymentSystem.processPayment(employee);
		
		Invoice invoice=new Invoice(1211, "supplying some training service", 12000, 30);
		
		PaymentSystem.processPayment(invoice);
	}
}
