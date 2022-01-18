package com.day7.session2.mcq.q5;

class ExceptionTest {
	
}

public class Demo {
	public static void foo()throws Exception {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			throw new Exception(oob);
		}
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println(re.getCause());
		}
	}
}
