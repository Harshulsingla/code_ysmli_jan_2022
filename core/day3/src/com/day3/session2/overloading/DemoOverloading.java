package com.day3.session2.overloading;
class Cal{
	
	public int add(Integer a, Integer b) {
		System.out.println("public int add(Integer a, Integer b)");
		return a+b;
	}
	//variable arg method 
	public int add(int ...a) {
		System.out.println("public int add(int ...a)");
		int sum=0;
		for(int temp: a) {
			sum+=temp;
		}
		return sum;
	}
}
public class DemoOverloading {
	
	public static void main(String[] args) {
		Cal cal=new Cal();
		
		long sum=cal.add(2, 2);
		
		System.out.println(sum);
	}

}


//public long add(int a, long b) {
//	return a+b;
//}
//public long add(long a, int b) {
//	return a+b;
//}

//public int add(int a, int b) {
//	return a+b;
//}
//public int add(int a, int b, int c) {
//	return a+b+c;
//}