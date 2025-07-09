class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0,curr = 0;
        for(int i=0;i<sentences.length;i++){
            curr = sentences[i].split(" ").length;
            ans = ans > curr ? ans : curr;
        }
        return ans;
    }
}