package ex2;

import java.util.Collections;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		Inventory inventory=new Inventory("YE12Yam");
		Product product=new Product(12, "struts", 5000.00, 10);
		Product product2=new Product(120, "turbo power engine", 500000.00, 12);
		Product product3=new Product(1002, "tyre", 8000.00, 12);
		
		
		inventory.addProduct(product);
		inventory.addProduct(product2);
		inventory.addProduct(product3);
		
		//inventory.printInventoryDetails();
		//inventory.procurment(12, 100);
		
		inventory.printInventoryDetails();
		
		inventory.issue(12, 4);
		
		inventory.printInventoryDetails();
		
//		LinkedList<String> list=new LinkedList<>();// :)
//		list.add("xam");
//		list.add("suman");
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		//iterator *
		
//		for(String data: list) {
//			System.out.println(data);
//		}
		//list.add(55);
		
		//
		
		//System.out.println(list);
		//String data=list.get(1);//O(N)
		//System.out.println(data);
		
		
	}
}
