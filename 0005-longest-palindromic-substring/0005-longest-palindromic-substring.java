class Solution {
    int start = 0;
    int max = 1;

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);       // odd
            expand(s, i, i + 1);   // even
        }

        return s.substring(start, start + max);
    }

    public void expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            if (right - left + 1 > max) {
                start = left;
                max = right - left + 1;
            }

            left--;
            right++;
        }
    }
}