class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0], c = 0, n = nums.length;
        if(nums[0] < 0)c++;
        for (int i = 1 ; i < n ; i++ ) {
            if(nums[i] < 0)c++;
            ans *= nums[i];
        }
        if((c & 1) == 0)return ans;
        int pre = nums[0], suff = ans/nums[0];
        for (int i = 1 ; i < n ; i++) {
            pre *= nums[i];
            suff /= nums[i];
            int curr = Math.max(pre,suff);
            ans = Math.max(curr,ans);
        }
        return ans;
    }
}