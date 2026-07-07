class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, sum = 0, ans = 0, n = nums.length;
        for(int j = 0; j < n; j++){
            sum += nums[j];
            while(sum < j - i)sum -= nums[i++];
            ans = ans > sum ? ans : sum; 
        }
        return ans == n ? ans - 1: ans;
    }
}