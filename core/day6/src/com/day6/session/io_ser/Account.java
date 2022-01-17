package com.day6.session.io_ser;

import java.io.Serializable;

public class Account implements Serializable{
	private int id;
	private String name;
	 double balance;
	static String bankName="sbi";
	//rule is that : min balance 1K
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", name=")
		.append(name).append(", balance=").append(balance)
		.append("bank name : ").append(bankName)
				.append("]");
		return builder.toString();
	}
	
	
	
	
}