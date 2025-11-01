class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0)nums[i] *= -1;
        }
        Arrays.sort(nums);
        long ans = 0;
        for(int i=0;i<n/2;i++){
            long val = nums[i] * nums[i];
            ans -= val;
        }
        for(int i=n/2;i<n;i++){
            long val = nums[i]*nums[i];
            ans += val;
        }
        return ans;
    }
}