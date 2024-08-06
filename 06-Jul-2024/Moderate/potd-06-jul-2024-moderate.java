import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
			
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();	
		int maxSum = slidingWindow(nums);
		System.out.println(maxSum);

		
	}

	private static int slidingWindow(int[] nums) {
		int N = nums.length;
		int currentMax = nums[0];
		int maxSum = nums[0];

		for (int i = 1; i < N; i++) {
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			if (currentMax > maxSum) {
				maxSum = currentMax;
			}
		}

		return maxSum;
	}

}
