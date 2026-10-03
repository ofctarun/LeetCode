class Solution {
    public int maxDistinct(String s) {
        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(s.contains(String.valueOf((char)('a' + i))))ans++;
        }
        return ans;
    }
}