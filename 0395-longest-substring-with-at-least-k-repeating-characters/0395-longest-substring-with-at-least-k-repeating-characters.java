class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;
        char[] arr = s.toCharArray();
        for(int req = 1; req <= 26; req++){
            if(arr.length < req * k) break;
            int i = 0, unq = 0, atleast = 0;
            int[] freq = new int[26];
            for(int j = 0; j < arr.length; j++){
                int curr = arr[j] - 'a';
                if(freq[curr]++ == 0) unq++;
                if(freq[curr] == k) atleast++;
                while(unq > req){
                    int curr2 = arr[i++] - 'a';
                    if(freq[curr2] == k) atleast--;
                    if(--freq[curr2] == 0) unq--;
                }
                if(atleast == req)ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}