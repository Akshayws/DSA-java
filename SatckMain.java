package ak;

public class SatckMain {

	public static void main(String[] args) throws StackException {
		// TODO Auto-generated method stub
		
	     CustumStack st= new DyanmicStack();
		//CustumStack st= new CustumStack(5);
		st.push(22);
		st.push(10);
		st.push(30);
		st.push(49);
		st.push(29);
		st.push(11);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
