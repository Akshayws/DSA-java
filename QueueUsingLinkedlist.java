package ak;

class GenerateNode {

	int data;
	GenerateNode next;

	public GenerateNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		next = null;
	}

}

public class QueueUsingLinkedlist {
	GenerateNode front, rear;

	void insert(int data) {

		GenerateNode node = new GenerateNode(data);

		if (rear == null) {
			rear = front = node;

			System.out.println("List is Empty");
		}

		rear.next = node;
		rear = node;
		System.out.println("is inserted " + data);

	}

	void delete()

	{
		if (isEmpty()) {
			System.out.println("list is Empty to delete");
		}
		GenerateNode temp = front;
		front = front.next;
		System.out.println("Data deleted:" + temp.data);
		if (front == null) {
			rear = null;
		}

	}

	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}
	    void getFront() {
		if (isEmpty()) {
			System.out.println("list is Empty to delete");
		}
		System.out.println("your front data:"+front.data);
		
	}
	    void getreart() {
			if (isEmpty()) {
				System.out.println("list is Empty to delete");
			}
			System.out.println("your rear data:"+rear.data);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedlist q = new QueueUsingLinkedlist();
		q.insert(10);

		for (int i = 0; i < 6; i++) {
			q.insert(i);
		}
		q.getFront();
		q.getreart();
		q.delete();
		q.delete();
		q.getFront();

	}

}
