package com.day6.session.io_ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationHelloWorld {

	public static void main(String[] args) {
		//I want to create an account object and want to save as a serilzed data into a file
		//ser
		try {
			ObjectOutputStream oos=new ObjectOutputStream
					(new FileOutputStream("/home/raj/Desktop/photo/data.txt"));
			Account account=new Account(121, "raj", 8000);
			account.balance=9999;
			account.bankName="hdfc";
			
			oos.writeObject(account);
			System.out.println("Ser is done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
