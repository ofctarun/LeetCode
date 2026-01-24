class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n/2  ;i++) {
            int curr = nums[i]+nums[n-i-1];
            ans = ans > curr ? ans : curr;
        }
        return ans;
    }
}