class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount=0;
        int start=0;
        int max_ones=0;
        int n = nums.length;
        for (int end=0; end<n; end++) {
            if (nums[end]==0) {
                zerocount++;
            }
            while (zerocount>k) {
                if (nums[start]==0) {
                    zerocount--;
                    
                }
                start++;
            }
            max_ones = Math.max(max_ones,end-start+1);

        }
        return max_ones;
    }
}