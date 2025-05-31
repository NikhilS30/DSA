package arrays;

public class Sum_of_all_Subarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		System.out.println(sumOfAllSubarray(arr));
	}

	private static int sumOfAllSubarray(int[] arr) {
		// step 1 calculate prefix sum
		int n = arr.length;
		int[] pf = new int[arr.length];

//		int sum = 0;
//		for (int i = 0; i < n; i++) {
//			sum = sum+arr[i];
//			pf[i]= sum;
//		}
		pf[0] = arr[0];
		for (int i = 1; i < n; i++) {
			pf[i] = arr[i] + pf[i - 1];
		}

		int ans = 0;
		// step 2 now find subarray
		for (int s = 0; s < n; s++) {
			for (int e = s; e < n; e++) {
				// now i have to use 3rd loop for calculating sum for s to e but i am optimizing
				// using prefix sum for range s to e
				if (s == 0) {
					ans += pf[e];
				} else {
					ans += pf[e] - pf[s - 1];
				}
			}
		}
		return ans;
	}

}
