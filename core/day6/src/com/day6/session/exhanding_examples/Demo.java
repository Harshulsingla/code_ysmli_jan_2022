package com.day6.session.exhanding_examples;

class AccountCreationException extends Exception{
	public AccountCreationException(String message) {
		super(message);
	}
}
class NOtSufficientFundException extends Exception{
	public NOtSufficientFundException(String message) {
		super(message);
	}
}
class OverFundException extends Exception{
	public OverFundException(String message) {
		super(message);
	}
}

class Account {
	private int id;
	private String name;
	private double balance;
	//rule is that : min balance 1K
	
	public Account(int id, String name, double balance)throws AccountCreationException {
		this.id = id;
		this.name = name;
		this.balance = balance;
		if(balance<1000) {
			throw new AccountCreationException("you can not create the account min balace must be 1000");
		}
	}
	//rule is that : min balance 1K
	public void withdraw(double amount) throws NOtSufficientFundException {
		double temp=balance-amount;
		if(temp<1000) {
			throw new NOtSufficientFundException("you cant withdraw "+ amount +" not NOtSufficientFund");
		}
		balance=temp;
	}
	//rule is that : max balance 5L
	public void deposit(double amount)throws OverFundException {
		double temp=balance+amount;
		if(temp>500000) {
			throw new OverFundException("you cant deposit "+ amount +" not OverFundException");
		}
		balance=temp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", name=").append(name).append(", balance=").append(balance)
				.append("]");
		return builder.toString();
	}
	
	
}

public class Demo {

	public static void main(String[] args) {

		try{
			Account account=new Account(121, "ajit", 4000.00);
			account.withdraw(1200);
			account.deposit(4000000);
			System.out.println(account);
		}catch(AccountCreationException ex) {
			System.out.println(ex.getMessage());
		}catch(NOtSufficientFundException ex) {
			System.out.println(ex.getMessage());
		}catch(OverFundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
