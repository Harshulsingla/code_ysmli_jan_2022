package com.day5.session1.mcq;
class Milk{
	
}
class PasteurizedMilk extends Milk{
	
}
class KrishnaDairy{
	public Milk sellMilk() {
		return null;
	}
}

class MordernKrishnaDairy extends KrishnaDairy {
	//overriding: overriden method must be an imporoved version of base method !
	public PasteurizedMilk sellMilk() {
		return null;
	}
}

public class CovarientReturnType {

	public static void main(String[] args) {

	}
}
