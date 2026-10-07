class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        ans[0] += nums[0] * 2;
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i])max = nums[i];
            ans[i] += ans[i - 1] + max + nums[i];
        }
        return ans;
    }
}