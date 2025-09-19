class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globalMax = nums[0], globalMin = nums[0];
        int curr1 = nums[0], curr2 = nums[0];
        int sum = nums[0];
        
        for (int i = 1 ; i < nums.length ; i++) {
            curr1 = Math.max(curr1 + nums[i] , nums[i]);
            curr2 = Math.min(curr2 + nums[i] , nums[i]);
            sum += nums[i];
            globalMax = Math.max(curr1 , globalMax);
            globalMin = Math.min(curr2 , globalMin);
        }

        return (globalMax < 0 ? globalMax :  Math.max(globalMax , sum - globalMin));
    }
}