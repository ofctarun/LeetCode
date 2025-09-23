class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1 , suff = 1 , n = nums.length;
        int ans = nums[0];
        for (int i = 0 ; i < n ; i++ ) {
            pre = (pre == 0 ? 1 : pre) * nums[i];
            suff = (suff == 0 ? 1 : suff) * nums[n - 1 - i];
            ans = Math.max(pre,Math.max(ans,suff));
        }
        return ans;
    }
}