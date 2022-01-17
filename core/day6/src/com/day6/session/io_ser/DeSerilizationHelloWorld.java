package com.day6.session.io_ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerilizationHelloWorld {

	public static void main(String[] args) {
		//i want to recover that object back and covert into a live java object
		//ser
		try {
			ObjectInputStream ois=new ObjectInputStream
					(new FileInputStream("/home/raj/Desktop/photo/data.txt"));
			
			Account account=(Account) ois.readObject();
			System.out.println(account);
			System.out.println("de-Ser is done");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
