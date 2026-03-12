class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        int unq = 0;
        for(char ch : s1.toCharArray()){
            if(freq[ch - 'a'] == 0)unq++;
            freq[ch - 'a']--;
        }
        int i = 0,j = 0;
        while(j < s2.length()){
            int cur1 = s2.charAt(j) - 'a';
            if(freq[cur1] == 0)unq++;
            freq[cur1]++;
            if(freq[cur1] == 0)unq--;
            System.out.println(unq);
            if(j - i + 1 < s1.length())j++;
            else{
                if(unq == 0)return true;
                int cur2 = s2.charAt(i) - 'a';
                if(freq[cur2] == 0)unq++;
                freq[cur2]--;
                if(freq[cur2] == 0)unq--;
                System.out.println(unq);
                i++;
                j++;
            }
        }
        return false;
    }
}