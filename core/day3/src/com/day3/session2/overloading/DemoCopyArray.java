package com.day3.session2.overloading;

import java.util.Arrays;

class ArrayOp{
	
	public int [] copyOf(int a[]) {
//		int temp[]=new int[a.length];
//		for(int i=0; i<a.length; i++) {
//			temp[i]=a[i];
//		}
		return Arrays.copyOf(a, a.length);
	}
}
public class DemoCopyArray {
	public static void main(String[] args) {
		
		ArrayOp arrayOp=new ArrayOp();
		
		int a[]= {4,6,7};
		
		int b[]= arrayOp.copyOf(a);
		
		b[1]=44;
		
		
		for(int temp: a) {
			System.out.println(temp);
		}
		
	}

}
