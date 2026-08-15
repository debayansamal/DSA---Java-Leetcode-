class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxsum=0;
        int minsum=0;
        int csum=0;
        int csum1=0;
        for (int i=0;i<n;i++) {
            csum+=nums[i];
            if (csum<0) {
                csum=0;
            }
            maxsum = Math.max(maxsum,csum);
            csum1+=nums[i];
            if (csum1>0) {
                csum1=0;
            }
            minsum = Math.min(minsum,csum1);
        }
        minsum=Math.abs(minsum);
        return Math.max(minsum,maxsum);
    }
}