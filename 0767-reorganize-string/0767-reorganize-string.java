class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int max = 0,maxChar = 0,idx = 0;
        for(char ch : s.toCharArray())freq[ch-'a']++;
        for(int i = 0; i < 26; i++){
            if(freq[i] > max){
                max = freq[i];
                maxChar = i;
            }
        }
        if(max > (s.length() + 1)/2)return "";
        char[] res = new char[s.length()];
        while(freq[maxChar] > 0){
            res[idx] = (char)(maxChar + 'a');
            idx += 2;
            freq[maxChar]--;
        }        
        for(int i=0;i<26;i++){
            while(freq[i] > 0){
                if(idx >= res.length)idx = 1;
                res[idx] = (char)(i + 'a');
                idx += 2;
                freq[i]--;
            }
        }
        return new String(res);
    }
}