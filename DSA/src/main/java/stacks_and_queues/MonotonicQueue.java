package stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Deque;

// this is maximum of a particular window solved using sliding window and queue ds
public class MonotonicQueue {
	private static int[] calculateMaxforSubarray(int[] arr, int k) {
		int len = arr.length;
		int[] ans = new int[len - k + 1];
		Deque<Integer> dq = new ArrayDeque<Integer>();

		for (int i = 0; i < k; i++) {
			while (dq.size() > 0 && dq.getLast() < arr[i]) {
				dq.removeLast();
			}
			dq.add(arr[i]);
		}
		ans[0] = dq.getFirst();
		
		int s = 1, e = k;
		while (e < len) {
			while (dq.size() > 0 && dq.getLast() < arr[e]) {
				dq.removeLast();
			}
			dq.addLast(arr[e]);

			if (arr[s - 1] == dq.getFirst()) {
				dq.removeFirst();
			}

			ans[s] = dq.getFirst();

			s++;
			e++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 15, 12, 8, 4, 10, 9, 7, 12, 10, 7, 14, 3 };
		int[] calculateMaxforSubarray = calculateMaxforSubarray(arr, 5);

		for (int num : calculateMaxforSubarray) {
			System.out.print(num + ",");
		}
	}
}