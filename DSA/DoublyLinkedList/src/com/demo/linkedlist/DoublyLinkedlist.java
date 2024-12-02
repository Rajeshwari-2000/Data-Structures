package com.demo.linkedlist;

public class DoublyLinkedlist {
	Node head;
	class Node{
		int data;
		Node prev,next; 
		

		public Node(int data) {
			super();
			this.data = data;
			prev = prev;
			next = next;
		}
	}
	
	public DoublyLinkedlist() {
		head=null;
	}


	public void addNode(int val) {
		Node newnode=new  Node(val);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
		
	}


	public void displayData() {
		
		
		Node temp =head;
		if(head!=null) {
			while(temp!=null) {
				System.out.println(temp.data+",");
				temp=temp.next;
			}
			System.out.println("----------------------------------------------------------------------------");
		}
		
	}


	public void displayDatainReverseOrder() {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.println(temp.data+",");
			temp=temp.prev;
		}
		System.out.println("----------------------------------------------------------------------------------------------------");
		
	}


	public void addBeforeKey(int val, int key) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node NewNode =new Node(val);
			if(head.data==key) {
				NewNode.next=head;
				head.prev=NewNode;
				head=NewNode;
				
			}else {
				Node temp=head;
				while(temp!=null &&  temp.data!=key) {
					temp=temp.next;
				}
				if(temp!=null) {
					NewNode.next=temp;
					NewNode.prev=temp.prev;
					temp.prev.next=NewNode;
					temp.prev=NewNode;
					
				}else {
					System.out.println("Key not found...");
				}
				
			}
			
		}
	
		
	}


	public void addAfterKey(int val, int key) {
		if(head==null) {
			System.out.println("List is empty...");
		}else {
			Node NewNode =new Node(val);
			Node temp=head;
			while(temp!=null && temp.data!=key) {
				temp=temp.next;
			}
			if(temp!=null) {
				NewNode.next=temp.next;
				NewNode.prev=temp;
				if(temp.next!=null) {
					temp.next=NewNode;
				}
				temp.next=NewNode;
			}
		}
		
	}


	public void deleteByPosition(int pos) {
		Node temp=head;
		if(pos==1) {
			if(head!=null) {
				head=head.next;
				if(temp.next!=null)
					temp.next.prev=null;
				temp.next=null;
				temp=null;
				
			}else {
				System.out.println("position is beyond the limit");
			}
			
		}else {
			for(int  i=1;temp!=null && i<=pos-1;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
				}
				temp.next=null;
				temp.prev=null;
				temp=null;
			}
			
		}
		
	}


	
}