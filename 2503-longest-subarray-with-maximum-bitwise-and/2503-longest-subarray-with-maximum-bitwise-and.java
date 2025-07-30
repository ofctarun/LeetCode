class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int num : nums) {
            max = max > num ? max : num;
        }
        int curr = 0, ans = 0;
        for(int num : nums) {
            if(num == max){
                curr++;
                ans = ans > curr ? ans : curr;
            }
            else curr = 0;
        }
        return ans;
    }
}