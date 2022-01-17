package com.day6.session.io_ser_comp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class Collar {
	int size;
	
	
	public Collar() {}

	public Collar(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Collar [size=").append(size).append("]");
		return builder.toString();
	}
}

class Dog implements Serializable {
	private String dogName;
	private transient Collar collar;// ignore collar dont save it

	public Dog(String dogName, Collar collar) {
		this.dogName = dogName;
		this.collar = collar;
	}
	//trick: jvm will call this method
	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("writeObject is called");
		oos.defaultWriteObject();
		oos.writeInt(collar.size);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		System.out.println("readObject is called");
		ois.defaultReadObject();
		this.collar=new Collar(ois.readInt());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [dogName=").append(dogName).append(", collar=").append(collar).append("]");
		return builder.toString();
	}
}

public class SerAndComposition {

	public static void main(String[] args) {
		Collar collar = new Collar(42);

		Dog dog = new Dog("stonish", collar);
		// ser
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/raj/Desktop/photo/ser3.txt"));
			oos.writeObject(dog);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// de-ser

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/raj/Desktop/photo/ser3.txt"));
			Dog dog1 = (Dog) ois.readObject();
			System.out.println(dog1);
		} catch (FileNotFoundException ex) {
			System.out.println("file is not found");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}
}
