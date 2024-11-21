package p1;

import java.util.Scanner;

public class QueueArrayCIrcular {

	static class Queue {
		static int arr[];
		static int size;
		static int rear = -1;

		Queue(int size) {
			this.size = size;
			arr = new int[size];
		}

		public static boolean isEmpty() {
			return rear == -1;
		}

		public static boolean isFull() {
			return rear ==( size - 1)%size;
		}

		public static void enqueue(int data) {
			if (isFull()) {
				System.out.println("Overflow");
				return;
			}
            
			rear = (rear + 1) % size;
			arr[rear] = data;
		}

		// O(n)
		public static int dequeue() {
	           if(isEmpty()) {
	               System.out.println("underflow");
	               return -1;
	           }
	           int front = arr[0];
	        
	           rear--;
	             return front;
	         }

		public static int peek() {
			if (isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}

			return arr[0];
		}
		public void display() {
			
		}
	}

	public static void main(String args[]) {
		Queue q = new Queue(5);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the choice");
		 int data,value,choice;
		    while(true) {
		    	System.out.println(" 1.Insert at input:\n 2.element is to be removed:  \n 3.Display \n 4. Exit");
		   
		    choice = sc.nextInt();
		      
		     switch(choice) {
		     case 1: 
		    	 System.out.println("Enter the input ");
		    	 data=sc.nextInt();
		    	q.enqueue(data);
		    	 break;
		     case 2:
		    	 System.out.println("element is to be removed:");
		    	 data=sc.nextInt();
		    	
		    	 break;
		     case 3:
		    	 System.out.println(" Display:");
		    	
		    	 
		    	 break;
		     case 4:
		    	 sc.close();
		    	 
		    	 System.out.println("Exit......");
		     default :
		    	 System.out.println("Invalid selection");
		    	 
		     }
	
		}
		
	}

}
