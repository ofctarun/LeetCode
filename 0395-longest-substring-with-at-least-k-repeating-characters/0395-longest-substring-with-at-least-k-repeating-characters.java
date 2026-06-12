class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;
        for(int req = 1; req <= 26; req++){
            int i = 0,unq = 0,atleast = 0;
            int[] freq = new int[26];
            for(int j = 0; j < s.length(); j++){
                int curr = s.charAt(j) - 'a';
                if(freq[curr] == 0)unq++;
                freq[curr]++;
                if(freq[curr] == k)atleast++;
                while(unq > req){
                    int curr2 = s.charAt(i) - 'a';
                    if(freq[curr2] == k)atleast--;
                    freq[curr2]--;
                    if(freq[curr2] == 0)unq--;
                    i++;
                }
                if(atleast == req)ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}