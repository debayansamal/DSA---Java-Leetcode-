class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left=0;
        int right=n-1;
        while (left<right) {
            if (s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return isP(s,left+1,right) || isP(s,left,right-1);
            }
        }
        return true;
    }
    public boolean isP(String s,int left,int right) {
        while (left<right) {
            if (s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }
            else {return false;}
        }
        return true;
    }
}