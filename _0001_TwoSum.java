
public class _0001_TwoSum {

	public static void main(String[] args) {
	//	int[] nums = { 2, 7, 11, 15 };
	}

	public int[] twoSum(int[] nums, int target) {
         
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				sum = nums[i] + nums[j];
				if (sum == target) {
					return new int[] {i , j};
				}

			}
		}
		throw new IllegalArgumentException("No solution");
	}
}
