class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        int[] s1c = new int[26];
        int[] s2c = new int[26];
        for (int i=0;i<n;i++) {
            int p1 = s1.charAt(i) - 'a';
            int p2 = s2.charAt(i) - 'a';
            s1c[p1]++;
            s2c[p2]++;
        }
        if (Arrays.equals(s1c,s2c)) {
            return true;
        }
        for (int i=1;i<=m-n;i++) {
            int prev = s2.charAt(i-1) - 'a';
            int next = s2.charAt(i+n-1) - 'a';
            s2c[prev]--;
            s2c[next]++; 
            if (Arrays.equals(s1c,s2c)) {
            return true;
        }      
        }
        return false;
    }
}