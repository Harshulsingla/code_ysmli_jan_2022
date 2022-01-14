package com.day5.session1.innerclasses;

interface Cookable{
	void cook();
}

/*
 * class StreetFood implements Cookable{
 * 
 * @Override public void cook() {
 * System.out.println("sound good in taste who know...."); }
 * 
 * }
 */
public class AnnonymousInnerClass {

	public static void main(String[] args) {
		//annomymous inner class vs lambada exp(better performance as compared to annonymous inner class*)
		//Java 8 => 2 days workshop
		
		Cookable cookable3=()-> {
				System.out.println("street food....");
			
		};
		
	Cookable cookable4=()-> {
			System.out.println("street food....");
		
	};
	
		
//		Cookable cookable=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("street food....");
//			}
//		};
//		
//		Cookable cookable2=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("hotel food....");
//			}
//		};
//		
		
	}
}
