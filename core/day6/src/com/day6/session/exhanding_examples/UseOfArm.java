package com.day6.session.exhanding_examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UseOfArm {
	
	public static void main(String[] args) {
		
		
		try(BufferedReader br=new BufferedReader(new FileReader(new File("story.txt")))){
			System.out.println("file is found");
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			
		}
		
		
//		BufferedReader br=null;
//		try{
//			 br=new BufferedReader(new FileReader(new File("story.txt")));
//			System.out.println("file is found");
//		}catch(FileNotFoundException ex) {
//			ex.printStackTrace();
//		}
//		finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
		
//		
//		try(Scanner scanner=new Scanner(System.in)){
//			//use the scanner as you want to use
//		}
//		
		
		
//		Scanner scanner=null;
//		try{
//			scanner=new Scanner(System.in);
//		}finally {
//		scanner.close();
//		}
	}

}
