class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m + n - 1; i >= m; i--) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    } // end of method
} // end of class