package com.day6.session2.doubts;

public class DemoDynicClassLoading {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//static class loading vs dynmic class loading*
		
		//DemoDoubts doubts=new DemoDoubts();
		
		Class.forName("com.day6.session2.doubts.DemoDoubts");
	}

}
