class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int i = 0, j = 0, unq = 0, ans = 0;
        while(j < s.length()){
            int idx = s.charAt(j);
            freq[idx]++;
            if(freq[idx] == 1)unq++;
            while(j - i + 1 > unq){
                int curr = s.charAt(i);
                freq[curr]--;
                if(freq[curr] == 0)unq--;
                i++;
            }
            if(j - i + 1 == unq)ans = Math.max(ans , unq);
            j++;
        }
        return ans;
    }
}