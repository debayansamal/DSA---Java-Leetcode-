class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;       // mid can be the answer
                low = mid + 1;  // try for a bigger value
            } 
            else {
                high = mid - 1;  // mid is too large
            }
        }

        return ans;
    }
}