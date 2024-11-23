package ak;

import java.util.Stack;

public class stackP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st= new Stack<>();
		st.push(111);
		st.push(12);
		st.push(90);
		st.push(40);
		st.push(80);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		

	}

}
