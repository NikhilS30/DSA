package stacks_and_queues;

import java.util.Stack;

public class RemoveDuplicates_Google {

	public static void main(String[] args) {
		String s = "adebbecaacded";
		System.out.println(finalString(s)); // Output: "dea"
	}

	private static String finalString(String s) {
		Stack<Character> st = new Stack<>();

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);

			// If stack is empty, just push
			if (st.isEmpty()) {
				st.push(ch);
			}
			// If top of stack is same as current char, it's a duplicate => pop
			else if (st.peek() == ch) {
				st.pop();
			}
			// If different, push it
			else {
				st.push(ch);
			}
		}

		// Now reverse the final string
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}

		return sb.toString(); // reverse again to get correct order
	}
}
