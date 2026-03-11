class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int unq = 0;
        int freq[] = new int[26];
        List<Integer> ans = new ArrayList<>();
        for(char ch : p.toCharArray()){
            int c = ch - 'a';
            if(freq[c] == 0)unq++;
            freq[c]--;
        }
        int i = 0,j = 0;
        while(j < s.length()){
            if(freq[s.charAt(j) - 'a'] == 0)unq++;
            freq[s.charAt(j) - 'a']++;
            if(freq[s.charAt(j) - 'a'] == 0)unq--;
            if(j - i + 1 < p.length())j++;
            else{
                if(unq == 0)ans.add(i);
                if(freq[s.charAt(i) - 'a'] == 0)unq++;
                freq[s.charAt(i) - 'a']--;
                if(freq[s.charAt(i) - 'a'] == 0)unq--;
                i++;
                j++;
            }
        }
        return ans;
    }
}