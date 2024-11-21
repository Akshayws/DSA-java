package akk;


class GNode {
	int data;
	GNode next,prv;
	public GNode(int data) {
		super();
		this.data = data;
		this.next = null;
		this.prv=null;
	}
	
}
public class DoubleEndedQueue {
    GNode front,rear=null;
    void insert_front(int item) {
    	GNode node= new GNode(item);
    	
    	if (front==null) {
    		rear=front=node;
    	//	System.out.println("list is Empty1");
    	}
    	else {
    		node.next=front;
    		front.prv=node;
    		front=node;
    	
    	}
    	System.out.println("inserted from front:"+front.data);
    	
    }
    
    void insert_rear(int item) {
    	GNode node= new GNode(item);
    	
    	if (rear==null) {
    		rear=front=node;
    		System.out.println("list is Empty");
    	}
    	else {
    		node.prv=rear;
    		rear.next=node;
    		rear=node;
    		
    		
    	}
    	System.out.println("inserted from rear:"+rear.data);
    }
    void delete_front() {
    
    	if(front==null) {
    		System.out.println("list is Empty");
    	}		
    	System.out.println("deleted from front:"+front.data);
    		front=front.next;
    		if(front!=null) {
    			front.prv=null;
    		}
    
    		rear=null;
    }
    
    void delete_rear(){
    	if(rear==null) {
    		System.out.println("List is Empty");
    		
    	}
    	System.out.println("Deleted from rear:"+rear.data);
    	rear=rear.prv;
    	if(rear!=null) {
    		rear.next=null;
    		
    	}
    	else {
    		front=null;
    	}
    }
    void display() {
    	GNode temp=front;
    	while(temp!=null) {
    		System.out.print("--> "+temp.data);
    		temp=temp.next;
    		
    	}
    	
    	
    	
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleEndedQueue db= new DoubleEndedQueue();
		db.insert_front(10);
		db.insert_rear(45);
		db.display();
		db.delete_front();
		db.display();
	
		

	}

}
