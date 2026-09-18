class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return bsearch(nums, 0,n-1,target);
    }
        private int bsearch(int[] nums,int i, int j, int target) {
            if (i > j) {
            return -1;
        }
            if (i==j) {
                if (nums[i]==target) {
                    return i;
                }
                else {
                    return -1;
                }
            }
            int mid = (i+j)/2;
            if (nums[mid]==target) {
                return mid;
            }
            if (target < nums[mid]) {
               return bsearch(nums,i,mid-1,target);
            }
            else {
                return bsearch(nums,mid+1,j,target);
            }
        }
    }