class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[] = new int[n+1];
        arr[0]=0;
        int sum=gain[0];
        arr[1]=sum;
        int max=arr[1];
        for (int i=1;i<n;i++) {
            sum+=gain[i];
            arr[i+1]=sum;
            if (arr[i+1]>max) {
                max = arr[i+1];
            }
        }
        if (max>0) {
            return max;
        }
        else {
            return 0;
        }
    }
}