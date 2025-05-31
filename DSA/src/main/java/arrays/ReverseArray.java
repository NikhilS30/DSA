package arrays;

/*
 * A basic question on array reverse without extra space
 * A follow up question with reverse in a range;
*/

public class ReverseArray {
	public static void reverseArray(int[] inputarray,int low,int high) {
		while(low<=high) {
			int helper = inputarray[low];
			inputarray[low]= inputarray[high];
			inputarray[high] = helper;
			low++; 
			high--;
		}
}


	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverseArray(arr,0,arr.length-1);
		
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}

}
