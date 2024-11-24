package akk;

import java.util.Scanner;

public class DoubleEndedQpa {
    int arr[];
    int front ;
    int rear;
    int size;
    public DoubleEndedQpa(int size) {
    	this.size=size;
    	arr=new int[size];
        front=-1;
        rear=-1;
        
    }
    boolean  Empty() {
    	return front==-1;
    
    }
    boolean Full() {
    	return (front==-1&&rear==size-1 )||(front==rear+1);
    	
    }
    void insert_front(int item) {
    	if(Full()) {
    		System.out.println("is full ");
    	}
    	if(front==-1)
    	{rear=front=0;}
    	
    	else if(front==0) {
    		front=size-1;
    		
    	}
    	else {
    		front--;
    	}
    	arr[front]=item;
    	}
    void insert_rear(int item) {
    	if(Full()) {
    		System.out.println("is full");
    	}
    	if (rear==-1) {
    		front=rear=0;
    	}
    	else if(rear==size-1) {
    		rear=0;
    	}
    	else {
    		rear++;
    	}
    	arr[rear]=item;
    }
	
	void Delete_front() {
		if(Empty()) {
			System.out.println("is Empty");
		}
		if(front==rear) {
			front=rear=-1;
		}
		else if(front==size-1) {
			front=0;
		}
		else {
			System.out.println("Element deleted from front: "+arr[front]);
			front++;
		}
		
	}
	void Delete_rear() {
		if(Empty()) {
			System.out.println("Is Empty");
		}
		if(rear==front) {
			front=rear=-1;
		}
		else if(rear==0) {
			rear=size-1;
			
		}
		else {
			System.out.println("Element deleted from rear: s"+arr[rear]);
			rear--;
		}
	}
	
	void display() {
		int temp= front;
		
		while(true) {
			
			System.out.print(arr[temp]);
			if(temp==rear) {
			break;
			}
			temp = (temp + 1) % size;
		}
	}
	
	public static void main(String[] args) {
		DoubleEndedQpa q= new DoubleEndedQpa(10);
		Scanner sc= new Scanner(System.in);
		
		int choice,data ;
	
		while(true) {
			System.out.println("1.insert from front: \n2.insert from rear:\n3.delete from front\n4.delete from rear\n5.Display\n6.Exit");
		    choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Ente the data");
				data=sc.nextInt();
				q.insert_front(data);
				break;
			case 2:
				System.out.println("Ente the data");
				data=sc.nextInt();
				q.insert_rear(data);
				break;
			case 3:
				q.Delete_front();
				break;
			case 4:
				q.Delete_rear();
				break;
			case 5:
				q.display();
				break;
			case 6:
				System.out.println("Exit");
				
				default:
					System.out.println("Invalid input");
			}
		}
		
	}
}

