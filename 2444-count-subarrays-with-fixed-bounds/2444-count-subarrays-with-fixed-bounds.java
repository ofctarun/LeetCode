class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int badIdx = -1, minIdx = -1, maxIdx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK)badIdx = i;
            if(nums[i] == minK)minIdx = i;
            if(nums[i] == maxK)maxIdx = i;
            int start = Math.min(minIdx, maxIdx);
            if(start > badIdx)ans += (start - badIdx);
        }
        return ans;
    }
}