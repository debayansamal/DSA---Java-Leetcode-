class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        StringBuilder ss = new StringBuilder(s);
        ss.reverse();

        String ans = "";

        for (int i = 0; i < n; i++) {

            String word = "";

            while (i < n && ss.charAt(i) != ' ') {
                word += ss.charAt(i);
                i++;
            }

            word = new StringBuilder(word).reverse().toString();

            if (word.length() > 0) {
                ans += " " + word;
            }
        }

        return ans.substring(1);
    }
}