package com.day4.session1.object_demo;

import java.math.BigDecimal;

public class DoubtOnAddOrSubOnDoubleValue {

	public static void main(String[] args) {

		// physics : persions of value , Delta, error

		//in real life when u are maniuplating double values => it could be buggy
		//it is safer to use "BigDecimal" Double.doubleToLongBits
		BigDecimal bigDecimal=new BigDecimal("1.10")
				.add(new BigDecimal("1.00"));
		
		if(bigDecimal.equals(2.10)) {
			System.out.println("yes!");
		}
		
		BigDecimal d2=new BigDecimal("1.10")
				.subtract(new BigDecimal("1.00"));
		System.out.println(d2);
		
		if(d2.doubleValue()==0.10)
			System.out.println("yes");
		else
			System.out.println("no");
		
		
//		double d = 1.1 - 1.00;
//
//		System.out.println(d);
//		if (d == 0.10)
//			System.out.println("yes");
//		else
//			System.out.println("no");
//		
		

//		double salary1=4000.001;
//		double salary2=4000.001;
//		
//		if(salary1!=salary2) {
//			System.out.println("not equals");
//		}else
//			System.out.println("equal");
//		
//		
//		double salaryVal1=Double.doubleToLongBits(salary1);
//		double salaryVal2=Double.doubleToLongBits(salary2);
//		
//		if(salaryVal1!=salaryVal2) {
//			System.out.println("not equals");
//		}else
//			System.out.println("equal");

	}
}
