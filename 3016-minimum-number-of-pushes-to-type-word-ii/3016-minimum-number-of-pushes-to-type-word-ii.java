class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray())freq[ch - 'a']++;
        Arrays.sort(freq);
        int c = 0,z = 0;
        for(int i = 25 ; i >= 0; i--){
            if(freq[i] != 0)c++;
            else break;
            if(c <=  8) z += freq[i];
            else if (c <= 16)z += 2 * freq[i];
            else if (c <= 24) z += 3 * freq[i];
            else z += 4 * freq[i];
        }
        return z;
    }
}