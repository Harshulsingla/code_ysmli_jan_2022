package com.day5.session1.innerclasses;
class LinkList{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Node tail=null;
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node currNode= head;
		if(currNode==null) {
			System.out.println("LL is empty...");
			return ;
		}
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
	}
}
public class DemoMyOwnLL {
	
	public static void main(String[] args) {
		LinkList linkList=new LinkList();
		linkList.addNode(33);
		linkList.addNode(3);
		linkList.addNode(303);
		
		linkList.display();
		
		
	}

}
