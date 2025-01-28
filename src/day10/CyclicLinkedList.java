package day10;

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
public class CyclicLinkedList {

	Node head; // point to first node in list
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CyclicLinkedList list = new CyclicLinkedList();
		Scanner sc = new Scanner(System.in);
		
		//Menu driven program
		
		while(true) {
			System.out.println();
			System.out.println("1.Insert at end");
			System.out.println("2.Create a loop");
			System.out.println("3.Detect a loop");
			System.out.println("4.Traversal of list or display");
			System.out.println("5.Exit");
			
			System.out.println("Enter you choice..");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the value to insert the  element..");
				int valend=sc.nextInt();
				list.insertatEnd(valend);
				break;
			case 2:
				System.out.println("Create a loop, enter the position: ");
				int pos=sc.nextInt();
				list.createLoop(pos);
				break;
			case 3:
				list.detectLoop();
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
		int count=0;
		Node temp=head;
		while(temp!=null && count<20) {
			System.out.print(temp.data+ "-> ");
			temp=temp.next;
			count++;
		}
		System.out.print("Null");
	}
	private boolean detectLoop() {
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			//move slow 1 and fast by 2 steps
			slow = slow.next; // 1 step
			fast=fast.next.next; // 2 step
			
			// slow and fast meet -> detect loop
			if(slow==fast) {
				System.out.println("Loop detected");
				return true;
			}
		}
		
		System.out.println("No loop detected");
		return false; 
		
		
	}
	private void createLoop(int pos) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		Node temp=head;
		Node loopnode=null;
		int count=1;
		
		while(temp.next!=null) {
			if(count==pos) {
				//store node in loop position
				loopnode=temp;
			}
			temp=temp.next;
			count++;
		}
		
		//create loop
		temp.next=loopnode; 
		
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

}
