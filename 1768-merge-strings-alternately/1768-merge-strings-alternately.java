class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0,j = 0,idx = 0,m = word1.length(),n = word2.length();
        char[] res = new char[m + n];
        while(i < m && j < n){
            res[idx++] = word1.charAt(i++);
            res[idx++] = word2.charAt(j++);
        }
        while(i < m)res[idx++] = word1.charAt(i++);
        while(j < n)res[idx++] = word2.charAt(j++);
        return new String(res);
    }
}