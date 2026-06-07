class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int i = 0, j = 0, unq = 0, ans = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            if (freq.get(ch) == 1)unq++;
            while (j - i + 1 > unq){
                char left = s.charAt(i);
                freq.put(left, freq.get(left) - 1);
                if (freq.get(left) == 0) {
                    freq.remove(left);
                    unq--;
                }
                i++;
            }
            if (j - i + 1 == unq)ans = Math.max(ans, unq);
            j++;
        }
        return ans;
    }
}