package com.day6.session.io_examples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FormattedIO {
	public static void main(String[] args) {
		
		//dataoutuptStream: for writing formate data
//		try {
//			DataOutputStream dos=new DataOutputStream(new FileOutputStream("foo.txt"));
//			for(int i=0;i<10; i++) {
//				dos.writeByte(i);
//				dos.writeShort(i);
//				dos.writeInt(i);
//			}
//			System.out.println("written");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		//data inputstram
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("foo.txt"));
			for(int i=0;i<10; i++) {
				System.out.printf("%d %d %d", dis.readByte(), dis.readShort(), dis.readInt());
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
