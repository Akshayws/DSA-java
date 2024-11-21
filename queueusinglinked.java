package p1;


public class queueusinglinked {

	
	static genratNode  front,rear;
	
	void enqueue(int data) {
		genratNode node=new genratNode(data);
		if (rear==null) {
			front=rear=node;
			
		}
		rear.next=node;
		rear=node;
		
		System.out.println("data inserted "+data); 
	}
	void Denque() {
		
		genratNode temp =front;
		front= front.next;
		if (front == null) {
			rear =null;
			
		}
		System.out.println("data is deleted "+temp.data);


	
		
	}
     
	void display() {
		if(front==null) {
			System.out.println("queue is Empty:");
			
		}
		
		genratNode temp =front; 
	while(temp!=null) {
			System.out.print("-->"+temp.data);
			temp=temp.next;
			
		}
	System.out.println();
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueusinglinked q= new queueusinglinked();
	
		for(int i=0;i<5;i++) {
			q.enqueue(i);
		}q.display();
		q.Denque();
		
		q.Denque();
		q.display();
	

	}

}
