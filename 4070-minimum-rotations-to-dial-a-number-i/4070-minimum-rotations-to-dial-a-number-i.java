class Solution {
    public int minRotations(String s) {
        int ans = 0, prev = 0;
        for(char ch : s.toCharArray()){
            int curr = ch - '0';
            if(prev > curr)ans += Math.min(prev - curr , 10 + curr - prev);
            else ans += Math.min(curr - prev , 10 + prev - curr);
            prev = curr;
        }
        return ans;
    }
}