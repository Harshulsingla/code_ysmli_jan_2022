package com.day4.session2.string_demo;

public class DemoString {

	public static void main(String[] args) {

		//how to reverse a string
		//		String vs StringBuilder vs StringBuffer
		/*	immutable		mutable			mutable
		 * thread safe		not 			most method are syn=> thread safe
		 * 					java 1.5	   slow old api, synchronized
		 * 				
		 * 
		 * 
		 * 
		 * 
		 */
		
		String st="i love india";
		//no revse method 
		
		String stRev=new StringBuffer().append(st).reverse().toString();
		System.out.println(stRev);
		
		//String s1="Aoo";
		//String s2="Foo";
		
//		if(s1.equals(s2))
//			System.out.println("are eq");
//		else
//			System.out.println("not eq");
//		
//		int value=s1.compareTo(s2);//strCmp bhi
//		System.out.println(value);
		
		//String class method 
		
		String data="   rajeev gupta   ";
		//System.out.println(data);
		data=data.trim();
		//System.out.println(data);
		
		//System.out.println(data.toUpperCase());
		//System.out.println(data.toUpperCase());
		
		
		
		//bad code
//		String a = "a" + "b" + "c" + "d" + "e";
//
//		System.out.println(a);

		//StringBuilder class:object are mutable mutable class
		
		String a = new StringBuilder().append("a").append("b").append("c").append("d").toString();
		

		System.out.println(a);
//
//		String s1 = new String("foo");
//		String s2 = "foo";
//
//		System.out.println(s1 == s2);

//		String s1="foo";
//		String s2="foo";
//		System.out.println(s1==s2);
	}
}
