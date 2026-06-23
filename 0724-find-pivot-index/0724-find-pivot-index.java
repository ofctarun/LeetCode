class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num: nums)sum += num;
        int prefix = 0;
        for(int i=0; i<nums.length; i++){
            int suffix = sum - nums[i] - prefix;
            if(prefix == suffix) return i;
            prefix += nums[i];
        }
        return -1;
    }
}