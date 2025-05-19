package stacks_and_queues;

import java.util.Stack;

public class inbuiltStacks {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		
	}

}
