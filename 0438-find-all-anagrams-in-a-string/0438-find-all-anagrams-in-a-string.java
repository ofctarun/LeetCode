class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int unq = 0;
        int freq[] = new int[26];
        List<Integer> ans = new ArrayList<>();
        for(char ch : p.toCharArray()){
            if(freq[ch - 'a'] == 0)unq++;
            freq[ch - 'a']--;
        }
        int i = 0,j = 0;
        while(j < s.length()){
            int curr = s.charAt(j) - 'a';
            if(freq[curr] == 0)unq++;
            freq[curr]++;
            if(freq[curr] == 0)unq--;
            if(j - i + 1 < p.length())j++;
            else{
                if(unq == 0)ans.add(i);
                int cur = s.charAt(i) - 'a';
                if(freq[cur] == 0)unq++;
                freq[cur]--;
                if(freq[cur] == 0)unq--;
                i++;
                j++;
            }
        }
        return ans;
    }
}