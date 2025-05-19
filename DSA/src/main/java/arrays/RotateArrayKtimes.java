package arrays;

/*
 * Step 1 : Reverse Entire array
 * Step 2 : Reverse first K elements
 * Step 3 : Reverse last N-k elements
*/

public class RotateArrayKtimes {
	public static void reverseArray(int[] inputarray, int low, int high) {
		while (low <= high) {
			int helper = inputarray[low];
			inputarray[low] = inputarray[high];
			inputarray[high] = helper;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int k = 8;   
		k=k%arr.length;   //since k is > than arr.length we had to mod
		reverseArray(arr, 0, arr.length - 1); // reverse Entire array
		reverseArray(arr, 0, k - 1); // reverse first K elements (iska matlab hai shuru ke k elements ab 0 based indexing hai isilie k-1 kiya
		reverseArray(arr, k, arr.length - 1); // reverse n-k(iska matlab hai k+1 but 0 base hai isilie k se n-1 tak ka)

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
