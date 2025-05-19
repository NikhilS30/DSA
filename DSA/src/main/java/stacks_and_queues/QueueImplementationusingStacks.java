package stacks_and_queues;

import java.util.Stack;

public class QueueImplementationusingStacks {
	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();

	public void enqueue(int x) {
		s1.push(x);
	}

	public int dequeue() {
			if (s2.size() + s1.size() == 0) {
				return -1;
			}
	
			if (s2.isEmpty()) {
				helper(); // to move elements from s1 to s2
			}
			return s2.pop();
	}

	public int front() {
			if (s2.size() + s1.size() == 0) {
				return -1;
			}
	
			if (s2.isEmpty()) {
				helper(); // to move elements from s1 to s2
			}
			return s2.peek();
	}

	private boolean isEmpty() {
		if (s1.isEmpty() && s2.isEmpty())
			return true;
		else
			return false;
	}

	private void helper() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
	}

	public static void main(String[] args) {
		QueueImplementationusingStacks queue = new QueueImplementationusingStacks();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue()); // Output: 1
		System.out.println(queue.front()); // Output: 2
		System.out.println(queue.isEmpty()); // Output: false
	}

}
