package p1;

import java.util.Scanner;

class genratNode {
	int data;
	genratNode next,prev;

	public genratNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}

public class LinkedListnode {

	static genratNode head;

	void insertAtBegin(int data) {
		genratNode node = new genratNode(data);
		if (ifEmpty()) {
			head = node;
			
		}
		else {
		head.next = node;//node.next=head        fro circular> node.next = head; ,  head = node;  , temp.next =head;
		                 //head.prv=node;
		                 //head=node;
		                
		
		head = node;
		
		
		}
	}

	void insertAtEnd(int data) {
		genratNode node = new genratNode(data);

		if (ifEmpty()) {
			head = node;
			System.out.println("List is Empty:");
		}
		genratNode temp = head;
		if (temp.next != null) {
			temp = temp.next;

		}else {
		temp.next = node;
	                    	//node.prev = temp;  for circular= node.next=head;
		
		}

	}

	void insertBetween(int data, int value) {
		genratNode node = new genratNode(data);
		if (ifEmpty()) {

			head = node;
			System.out.println("List is Empty:");
		}
		genratNode temp = head;

		if (temp.next !=null&&temp.data != value) {
			temp = temp.next;

		} else {
			if (temp != null) {
				node.next = temp.next;
				temp.next = node;
				                 //node.prv=temp;
			}

			System.out.println("value is not present :");
		}
		System.out.println("Inserted value" + value + "in between :" + data);
	}

	private boolean ifEmpty() {
		// TODO Auto-generated method stub
		if (head == null) {
			return true;
		}
		return false;
	}

	void display() {
		genratNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListnode ll = new LinkedListnode();
	    Scanner sc = new Scanner(System.in);
	    int data,value,choice;
          
	    while(true) {
	    	System.out.println(" 1.Insert at begining:\n 2.insert at the End:\n 3.Insert after data \n 4.Display \n 5. Exit");
	   
	    choice = sc.nextInt();
	      
	     switch(choice) {
	     case 1: 
	    	 System.out.println("Enter the data ");
	    	 data=sc.nextInt();
	    	 ll.insertAtBegin(data);
	    	 break;
	     case 2:
	    	 System.out.println("Enter the data to insert at end:");
	    	 data=sc.nextInt();
	    	 ll.insertAtEnd(data);
	    	 break;
	     case 3:
	    	 System.out.println("ENter data and value");
	    	  value=sc.nextInt();
	    	  data=sc.nextInt();
	    	  ll.insertBetween(data, value);
	    	  break;
	    	  
	     case 4:
	    	 ll.display();
	    	 break;
	     case 5:
	    	 sc.close();
	    	 
	    	 System.out.println("Exit......");
	     default :
	    	 System.out.println("Invalid selection");
	    	 
	     }
	    	 
	
	
	    }
	}

}
