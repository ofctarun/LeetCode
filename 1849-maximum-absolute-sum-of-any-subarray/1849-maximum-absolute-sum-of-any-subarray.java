class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        if(n==1)return Math.abs(nums[0]);
        int ans = nums[0];
        int curr1 = nums[0],curr2 = nums[0];
        for(int i=1;i<n;i++){
            curr1 = Math.max(curr1+nums[i],nums[i]);
            curr2 = Math.min(curr2+nums[i],nums[i]);
            ans = Math.max(Math.max(curr1,Math.abs(curr2)),ans);
        }
        return ans;
    }
}