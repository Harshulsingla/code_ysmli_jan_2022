package com.day6.session.io_ser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

import com.day6.session.io_ser_comp.Dog;
class Rat implements Serializable{
	
}
class Cat implements Serializable{
	
}

class Dog implements Serializable{
	
}

public class OrderOfSerNeedToBeMaintain {

	public static void main(String[] args) {
		//ser
		
//		try {
//			ObjectOutputStream oos=new ObjectOutputStream
//					(new FileOutputStream("/home/raj/Desktop/photo/cat.txt"));
//			
//			Rat rat=new Rat();
//			Cat cat=new Cat();
//			Dog dog=new Dog();
//			
//			oos.writeObject(rat);
//			oos.writeObject(cat);
//			
//			oos.writeObject(dog);
//			
//			System.out.println("ser is done rat, cat , dog");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
		
		//De- ser
		try {
			ObjectInputStream ois=new ObjectInputStream
					(new FileInputStream("/home/raj/Desktop/photo/cat.txt"));
			
			Rat rat=(Rat) ois.readObject();
			Cat cat= (Cat) ois.readObject();
			Dog dog= (Dog) ois.readObject();
			
			System.out.println("de-ser is done rat, cat , dog");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
}
