class Solution {
    public int longestOnes(int[] nums, int k) {
    
        int left = 0;
        int window = 0;
        int sum = -1;
        for (int right = 0;right<nums.length;right++) {
            window+=nums[right];
            while ((right - left + 1) - window > k) {
                window-= nums[left];
                left++;
            }
            sum = Math.max(sum,right-left+1);
        }
        return sum;
    }
}
