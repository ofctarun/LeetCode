class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];
        int n = s.length();
        for(int i = 0 ; i < n ; i++)count[s.charAt(i) - 'a']++;
        int vowel = 0 , consonant = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20){
                if(vowel < count[i]) vowel = count[i];
            }
            else{
                if(consonant < count[i]) consonant = count[i];
            }
        }
        return vowel + consonant;
    }
}