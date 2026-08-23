class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i=0;i<s.length();i++) {
            count+= cp(s,i,i);
            count+=cp(s,i,i+1);
        }
        return count;
    }
    private int cp(String s, int i,int j) {
        int count=0;
        while (i>=0 && j<=s.length()-1 && s.charAt(i)==s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }
}