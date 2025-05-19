package stacks_and_queues;

import java.util.*;

public class NearestSmallerToLeft {
	public static List<Integer> nearestSmallerToLeft(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0 ;i<arr.length;i++) {
			// Pop elements from the stack until we find a smaller one
			while (stack.size()>0 && stack.peek() >= arr[i]) {
				stack.pop();
			}

			// If stack is empty, no smaller element to the left
			if (stack.isEmpty()) {
				result.add(-1);
			} else {
				result.add(stack.peek());
			}

			// Push current element onto stack
			stack.push(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		System.out.println(nearestSmallerToLeft(arr)); // Output: [-1, 4, -1, 2, 2]
	}
}
