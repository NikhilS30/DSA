package arrays;

public class CreatePrefixSum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] pf = new int[arr.length];

		pf[0] = arr[0]; // edge case 
		for (int i = 1; i < pf.length; i++) {
			pf[i] = arr[i] + pf[i - 1];
		}

		for (int num : pf) {
			System.out.print(num + " ");
		}
	}
}