package com.day5.session1.io_and_exceptions_examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoIO3 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("stry.txt")));

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException ex) {
			System.out.println("file is not found");
			System.out.println(ex);

		} catch (IOException ex) {
			System.out.println("io exception");
			System.out.println(ex);
		}catch(Exception ex) {
			System.out.println("some ex");
		}

		finally {
			System.out.println("i am in finally block");
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("still working...");
	}

}
