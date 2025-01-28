package day8;

import java.util.Scanner;

class Queue{
	
	
	public int[] queue;
	public int size;
	public int front;
	public int rear;
	
	public Queue(int size) {
		
		this.size=size;
		queue= new int[size];
		front=0;
		rear=-1;
	}

	public void enqueue(int element) {
		
		// queue is full
		if(rear==size-1) {
			System.out.println("Queue overfloew");
			return;
		}
		queue[++rear]=element;
		System.out.println(element);
		
	}

	public int dequeue() {
		// TODO Auto-generated method stub
		
		if(front> rear) {
			System.out.println("Queue underflow");
			return -1;
		}
		System.out.println("Dequeued: " +queue[front]);
		return queue[front++];
	}

	public int peek() {
		// TODO Auto-generated method stub
		if(front>rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[front];
	}

	public void display() {
		// TODO Auto-generated method stub
		
		if(front>rear) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
}

public class QueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		int size = sc.nextInt();
		
		Queue q= new Queue(size);
		
		while(true) {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			
			System.out.println("Choose an operation: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the element  to enqueue");
				int element=sc.nextInt();
						q.enqueue(element);
				break;
			case 2: 
				q.dequeue();
				break;
			
			case 3:
				int frontelement=q.peek();
				if(frontelement != -1) {
				System.out.println("Front element: "+frontelement);
				}
				break;
			case 4:
				q.display();
				break;
			case 5:
				System.out.println("Exiting..");
				System.exit(0);
				break;
				default: 
					System.out.println("Invalid choice.");
			}
		}
	}

}
