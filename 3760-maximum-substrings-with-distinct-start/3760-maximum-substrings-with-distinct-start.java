class Solution {
    public int maxDistinct(String s) {
        int[] freq = new int[26];
        int ans = 0;
        for(char ch : s.toCharArray()){
            freq[ch- 'a']++;
            if(freq[ch - 'a'] == 1)ans++;
        }
        return ans;
    }
}