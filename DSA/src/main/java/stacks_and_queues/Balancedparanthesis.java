package stacks_and_queues;

import java.util.Stack;

public class Balancedparanthesis {
	
	public static void main(String[] args) {
		String s = "{[()])";
		System.out.println(checkIfBalanced(s));
	}

	private static boolean checkIfBalanced(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
				st.push(s.charAt(i)); 
			}else {
				if(st.size()==0) {
					return false;
				}
				if(ch=='}' && st.peek()=='{') {
					st.pop();
				}else if(ch==']' && st.peek()=='[') {
					st.pop();
				}else if(ch==')' && st.peek()=='(') {
					st.pop();
				}else {
					return false;
				}
			}
		}
		if(st.size()==0)
			return true;
		
		return false;
	}

}
