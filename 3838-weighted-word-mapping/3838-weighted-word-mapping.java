class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] ans = new char[words.length];
        for(int i=0;i<words.length;i++){
            int sum = 0;
            for(char ch : words[i].toCharArray())sum += weights[ch - 'a'];
            ans[i] = (char)(122 - (sum % 26));
        }
        return new String(ans);    
    }
}