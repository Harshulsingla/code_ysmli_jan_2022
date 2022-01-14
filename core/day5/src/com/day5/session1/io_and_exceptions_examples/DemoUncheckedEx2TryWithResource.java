package com.day5.session1.io_and_exceptions_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoUncheckedEx2TryWithResource {

	public static void main(String[] args) {
		// divide two numbers
		// Checked ex

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("PE first no");
			int x = scanner.nextInt();
			System.out.println("PE sec no");
			int y = scanner.nextInt();

			int z = x / y;

			System.out.println("result is : " + z);
		} catch (ArithmeticException ex) {
			System.out.println("divide by zero is not possible");
		} catch (InputMismatchException ex) {
			System.out.println("only int is allowed");
		}

		System.out.println("end");
	}

}
