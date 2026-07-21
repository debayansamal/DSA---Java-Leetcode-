class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int window = 0;
        int sum = -1;
        for (int right = 0;right<nums.length;right++) {
            window+=nums[right];
            while (right-left+1 != window) {
                window-= nums[left];
                left++;
            }
            sum = Math.max(sum,right-left+1);
        }
        return sum;
    }
}