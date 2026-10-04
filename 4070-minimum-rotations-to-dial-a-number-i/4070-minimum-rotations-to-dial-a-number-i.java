class Solution {
    public int minRotations(String s) {
        int ans = 0, prev = 0;
        for(char ch : s.toCharArray()){
            int curr = ch - '0', diff = Math.abs(prev - curr);
            ans += Math.min(diff, 10 - diff);
            prev = curr;
        }
        return ans;
    }
}