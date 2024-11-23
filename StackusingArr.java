package ak;

public class StackusingArr {

	int arr[];
	int top =-1;
	int cap=10;
	public StackusingArr(int size) {
		super();
		cap=size;
       arr=new int[cap];
       
		
	}
	public void push(int item) {
		if(isfull()) {
			System.out.println("Stack is full!");
			
		}
		
//		top++;
//		arr[top]=item;
		arr[++top]=item;
		
	}
	
	public void pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty to pop!");
		}
		System.out.println("Index "+top+" Elements which are poped"+arr[top]);
		top--;
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is Empty to peek:");
		}
	    int out = arr[top];
	    System.out.println(arr[top]);
	}
	private boolean isfull() {
		// TODO Auto-generated method stub
		return top==arr.length-1;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return  top==-1;
	}
	public static void main(String[] args) {
		StackusingArr st= new StackusingArr(6);
		st.push(22);
		st.push(10);
		st.push(30);
		st.push(49);
		//st.push(29);
		//st.push(11);
		
		
		st.pop();
		st.pop();
		st.pop();
		//st.pop();
		st.pop();
		st.peek();
		st.peek();
	
	}
	
}
