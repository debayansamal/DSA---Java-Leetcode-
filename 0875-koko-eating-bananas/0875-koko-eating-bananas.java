class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for (int i=0;i<piles.length;i++) {
            max = Math.max(max,piles[i]);

        }
        while (min<max) {
            int mid = min + ((max-min)/2);
            if (caneat(piles,h,mid)) {
                max=mid;
            } else {
                min=mid+1;
            }
        }
        return min;
    }
    private boolean caneat(int[] piles, int h,int mid ) {
        int hours=0;
        for (int i=0;i<piles.length;i++) {
            hours+=Math.ceil((double)piles[i]/mid);
        }
        return hours<=h;
    }
}