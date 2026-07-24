class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int window = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            window += nums[right];

            while (window >= target) {

                min = Math.min(min, right - left + 1);

                window -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}