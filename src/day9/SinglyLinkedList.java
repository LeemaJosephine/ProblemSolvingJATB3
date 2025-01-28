package day9;

import java.util.Scanner;

class Node{
	
	int data; //value
	Node next; // address of the next node
	
	//Constructor
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

public class SinglyLinkedList {

	Node head; // point to first node in list
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList list=new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		
		//Menu driven program
		
		while(true) {
			System.out.println();
			System.out.println("1.Insert at beginning");
			System.out.println("2.Insert at end");
			System.out.println("3.Delete a node");
			System.out.println("4.Traversal of list");
			System.out.println("5.Exit");
			
			System.out.println("Enter you choice..");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the value to insert at the beginning..");
				int valbeg=sc.nextInt();
				list.insertatBegin(valbeg);
				break;
			case 2:
				System.out.println("Enter the value to add in the end");
				int valend=sc.nextInt();
				list.insertatEnd(valend);
				break;
			case 3:
				System.out.println("Enter the value to delete");
				int valdel=sc.nextInt();
				list.delete(valdel);
				break;
			case 4: 
				list.display();
				break;
			case 5:
				System.out.println("Exiting");
				System.exit(0);
			default: 
				System.out.println("Invalid choice!!");
				
			}
		}
	}
	private void display() {
		// TODO Auto-generated method stub
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ "-> ");
			temp=temp.next;
		}
		System.out.print("Null");
		
	}
	private void delete(int valdel) {
		// TODO Auto-generated method stub
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		//if the head node contains any key to delete
		if(head.data==valdel) {
			head = head.next;
			return;
		}
		
		//deletion
		Node temp=head;
		//traverse until you find the element
		while(temp.next!=null && temp.next.data!=valdel) {
			temp=temp.next;
		}
		
		if(temp.next==null) {
			System.out.println("Node not found");
		} else {
			temp.next=temp.next.next; 
		}
		
		
		
	}
	private void insertatEnd(int valend) {
		// TODO Auto-generated method stub
		Node newnode=new Node(valend); // create node
		//list is empty
		if(head==null) {
			head=newnode;
			return;
		}
		
		//start from head
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=newnode; //a new node data inserted into last node		
		
	}
	private void insertatBegin(int valbeg) {
		
		Node newnode=new Node(valbeg); // create node
		newnode.next=head;
		head=newnode;
	}

}
