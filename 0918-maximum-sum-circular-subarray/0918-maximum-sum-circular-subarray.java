class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;
        int tsum = 0;

        int minsum = Integer.MAX_VALUE;
        int currMin = 0;

        int maxsum = Integer.MIN_VALUE;
        int currmax = 0;

        for (int i = 0; i < n; i++) {

            tsum += nums[i];

            currMin += nums[i];
            minsum = Math.min(minsum, currMin);

            if (currMin > 0) {
                currMin = 0;
            }
            currmax+=nums[i];
            maxsum=Math.max(maxsum,currmax);
            if (currmax<0) {
                currmax=0;
            }
        }
        if (maxsum < 0) {
    return maxsum;
}
        int csum= tsum-minsum;


        return Math.max(maxsum,csum);
    }
}