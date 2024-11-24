package akk;

import java.util.Scanner;

public class circularQueue {
    
	int size;
	int arr[];
	int front;
	int rear;
	
	public circularQueue(int size) {
		// TODO Auto-generated constructor stub
		this.size=size;
		arr=new int [size];
		front=rear=0;
	}
	boolean full() {
		return rear==(size-1)%size;
	}
	boolean Empty() {
		return front==rear;
	}

	
	void insert_front(int item) {
		
		if(full()) {
			System.out.println("is Full");
		}
		front =(front-1+size)%size; //start from index 4 for front 0 end is 3
		
	    arr[front]=item;
	}
	void insert_rear(int item) {
		
		if(full()) {
			System.out.println("Arr is full");
			
		}
		rear=(rear+1)%size;//start from 1  for rear=0;towards 0
		arr[rear]=item;
	}
	void delete_front() {
		if(Empty()) {
			System.out.println("Is Empty");
		}
		front=(front+1)%size;//delete 4 by going to to index 1
		
	}
	void delete_rear() {
		if(Empty()) {
			System.out.println("is Empty");
			
		}
		rear=(rear-1)%size;
	}
	void Display() {
		int temp=front;
		while(true) {
			System.out.println(arr[temp]+" ");
			if(temp==rear) {
				break;
			}
			temp=(temp+1)%size;
		}
	}
	
	
	public static void main(String[] args) {
		circularQueue cq=new circularQueue(20);
		Scanner sc= new Scanner(System.in);
		
		
		int choice,data ;
		
		while(true) {
			System.out.println("1.insert from front: \n2.insert from rear:\n3.delete from front\n4.delete from rear\n5.Display\n6.Exit");
		    choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Ente the data");
				data=sc.nextInt();
				cq.insert_front(data);
				break;
			case 2:
				System.out.println("Ente the data");
				data=sc.nextInt();
				cq.insert_rear(data);
				break;
			case 3:
				cq.delete_front();
				break;
			case 4:
				cq.delete_rear();
				break;
			case 5:
				cq.Display();
				break;
			case 6:
				System.out.println("Exit");
				
				default:
					System.out.println("Invalid input");
			}
		}

	}

}
