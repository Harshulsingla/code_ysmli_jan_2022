package ex2;
import java.util.*;
public class HowToSortsParts {

	public static void main(String[] args) {
		
		LinkedList<Product> list=new LinkedList<>();// :)
		list.add(new Product(12, "struts", 5000.00, 102));
		list.add(new Product(102, "tyre", 15000.00, 102));
		
		// how to solve it : ie how to sort user define collection in java
		//Comparable and comparator ******
		//Collections.sort(list);
		
		//System.out.println(list);
		
		
//		LinkedList<String> list=new LinkedList<>();// :)
//		list.add("xam");
//		list.add("suman");
//		
//		Collections.sort(list);
//		System.out.println(list);
	}
}
