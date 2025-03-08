class Solution {
    boolean isEqual(int[] s1,int[] s2){
        for(int i=0;i<26;i++){
            if(s1[i]>0 && s2[i]>0)return false;
        }
        return true;
    }
    public int maxProduct(String[] words) {
        int ans = 0;
        int word[][] = new int[words.length][26];  
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray())word[i][ch-'a']++;
            for(int j=0;j<i;j++){
                if(isEqual(word[i],word[j])){
                ans = Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
}