package stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {

	public static void main(String[] args) {
		Deque<Integer> dequeue = new ArrayDeque<Integer>();
		dequeue.addFirst(1);
		dequeue.addFirst(2);
		dequeue.addFirst(3); // 3 2 1 element inserted in this order
		System.out.println("this method gets and remove first element :: " + dequeue.removeFirst());
		System.out.println("this method gets and remove last element :: "+ dequeue.removeLast());
		
	}
}