class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuilder ans = new StringBuilder();

for(char c : list) {
    for(int i = 0; i < map.get(c); i++) {
        ans.append(c);
    }
}
return ans.toString();
    }
}