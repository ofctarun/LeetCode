class Solution {
    public int numSplits(String s) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int ans = 0, unq = 0, currUnq = 0; 
        for(char ch : s.toCharArray()){
            int curr = ch - 'a';
            freq1[curr]++;
            if(freq1[curr] == 1)unq++;
        }
        for(char ch : s.toCharArray()){
            int curr = ch - 'a';
            freq2[curr]++;
            freq1[curr]--;
            if(freq2[curr] == 1)currUnq++;
            if(freq1[curr] == 0)unq--;
            if(currUnq == unq)ans++;
        }
        return ans;
    }
}