
public class _0088_MergeSortedArray {
	/*
	 * nums1 = 1,2,3,0,0,0 nums2 = 2,5,6
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int c1 = m - 1;
		int c2 = n - 1;
		int c3 = nums1.length - 1;

		while (c1 >= 0 && c2 >= 0) {
			if (nums1[c1] > nums2[c2])
				nums1[c3--] = nums1[c1--];
			else
				nums1[c3--] = nums2[c2--];
		}

		while (c1 >= 0) 
			nums1[c3--] = nums1[c1--];
		
		while (c2 >= 0) 
			nums1[c3--] = nums2[c2--];
	}
}
