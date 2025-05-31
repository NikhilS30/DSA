package arrays;

public class Kadanes_algo {
	public static void main(String[] args) {
		int []  arr = {1,-2,3,5,7};
		int curr_sum=Integer.MIN_VALUE;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			curr_sum+=arr[i];
			ans = Math.max(ans, curr_sum);
			if(curr_sum<0) {
				curr_sum=0;
			}
		}
		System.out.println(ans);
	}
}

/*
 * 1 12 123 1234 12345
 * 2 21 22 23
 * 3 31 32
 * 4 41
 * 5
 * 
 */
