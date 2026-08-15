class Solution {
    public boolean isPalindrome(String s) {
        char b[] = s.toCharArray();
        int n =b.length;
        int end = n-1;
        int i=0;
    while (i<end) {

    while (i<end &&!Character.isLetterOrDigit(b[i])) {
        i++;
    }

    while (i<end && !Character.isLetterOrDigit(b[end])) {
        end--;
    }
            if (Character.toLowerCase(b[i]) != Character.toLowerCase(b[end])) {
                return false;
            }
                end--;
                i++;
                
            

        }

                    return true;
    }
}