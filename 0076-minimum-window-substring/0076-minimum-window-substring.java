class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (m>n) {
            return "";
        }
        int[] s1 = new int[256];
        int[] t1 = new int[256];
        for (char c : t.toCharArray()) {
            t1[c]++;
        }
        int left=0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        for (int right=0;right<n;right++) {
            s1[s.charAt(right)]++;
            while (contains(s1,t1)) {
                if (right-left+1<min) {
                    min = right-left+1;
                    start=left;
                }
                s1[s.charAt(left)]--;
                left++;

            }


        }
        if (min == Integer.MAX_VALUE)
    return "";
            return s.substring(start, start + min);
    }
        public boolean contains(int[] sCount, int[] tCount) {

        for (int i = 0; i < 256; i++) {
            if (tCount[i] > sCount[i])
                return false;
        }

        return true;
    }
}