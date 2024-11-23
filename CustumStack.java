package ak;

public class CustumStack {

	
	protected int [] data;
	private static final int Default_size =10;
	int ptr =-1;
	
	public CustumStack() {
		this(Default_size);
		
	}

	public CustumStack(int size) {
		// TODO Auto-generated constructor stub
		this.data=new int[size];
		
		
	}
	public boolean push(int item) {
		if(isfull()) {
			System.out.println("stack is full: ");
			return false;
		}
//		ptr++;
//		data[ptr]=item;
		data[++ptr]=item;
		return true;
		
	}
	

	public int pop() throws StackException {
		if(isEmpty()) {
			throw new StackException("Cannot pop from empty stack");
		}
		int remove = data[ptr];
		ptr--;
		return remove;
		
	}
	public int peek() throws StackException  {
		if (isEmpty()) {
			throw new StackException("cannot peek from empty satck!");
		}
		return  data[ptr];		
	}
	
	
	public  boolean isfull() {
		
		
		return  ptr==data.length-1;//ptr is last index
	}
	public boolean isEmpty() {
		
		return ptr==-1; //inital position
	}
	
	
}
