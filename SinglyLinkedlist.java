package ak;

public class SinglyLinkedlist {
	
	static singlynode head;
	
	public void insertBeg(int data) {
		
		singlynode newnode = new singlynode(data);
		if (head==null) {
			System.out.println("empty node!");
			head=newnode;
			
		}
		newnode.next=head;
		head =newnode;
		System.out.println("begining on node:"+head+"-->"+data);
		
	}
	
	public void insertEnd(int data) {
		singlynode newnode = new singlynode(data);
		if (head==null) {
			head=newnode;
			
		}
		singlynode temp = head;
		while(temp.next !=null) {
			temp=temp.next;
			
		}
	     temp.next=newnode;//we  get the end here or we get the node we want
	     
	     System.out.println("End node:"+newnode.data);
	}
	
	
	public void insertAfterGivenNode(int data,int value) {
		singlynode newnode= new singlynode(data);
		if (head==null) {
			head=newnode;
			
		}
		singlynode temp=head;
		while(temp !=null && temp.data !=value ) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Node whith value "+value+"not found");
		}
		
	    newnode.next = temp.next;//link the node
	    temp.next= newnode;//insert the value infront of value
	    System.out.println("Inserted node: " + data + " after node: " + value);
		
	}
	public void dispaly() {
		singlynode temp =head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		SinglyLinkedlist lis= new SinglyLinkedlist();
		head = new singlynode(10);
		
		lis.insertBeg(22);
		lis.insertAfterGivenNode(99,10);

		lis.insertEnd(33);
		lis.dispaly();
		
	}
}


 

