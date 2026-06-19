class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0)return nums;
        long sum = 0;
        int n = nums.length, win = 2*k+1;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        if(nums.length < win)return ans;
        for(int i = 0; i < win; i++)sum += nums[i];
        ans[k] = (int)(sum/win);
        for(int i = k + 1; i < n - k; i++){
            sum = sum - nums[i-k-1]+nums[i+k];
            ans[i] = (int)(sum/win);
        }
        return ans;
    }
}