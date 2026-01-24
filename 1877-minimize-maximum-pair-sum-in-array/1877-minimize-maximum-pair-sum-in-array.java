class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n/2  ;i++) {
            ans = ans > nums[i]+nums[n-i-1] ? ans : nums[i]+nums[n-i-1];
        }
        return ans;
    }
}