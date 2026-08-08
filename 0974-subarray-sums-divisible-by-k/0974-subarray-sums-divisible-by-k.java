class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int psum=0;
        int count=0;
        for (int i=0;i<n;i++) {
            psum+=nums[i];
            int rem =(psum % k + k) % k;
            if (map.containsKey(rem)) {
                count+=map.get(rem);
               
            }
             map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return count;
    }
}