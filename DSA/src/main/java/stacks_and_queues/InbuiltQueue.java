package stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class InbuiltQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new ArrayDeque<Integer>();
		System.out.println("current first element :: " + queue.peek()); // becoz the queue is empty

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("current first element after adding elements :: " + queue.peek());
		System.out.println("size of queue :: " + queue.size());
		System.out.print("current elements :: ");
		for (int num : queue) {
			System.out.print(num + " ,");
		}
		System.out.println();
		
		queue.poll(); // to remove front element
		System.out.println("size of queue after removing head :: " + queue.size());
		for (int num : queue) {
			System.out.print("current elements :: " + num + " ,");
		}

	}

}
