class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long ans = 0;
        for(int i=0;i<nums.length/2;i++){
            long val = nums[i] * nums[i];
            ans -= val;
        }
        for(int i=nums.length/2;i<nums.length;i++){
            long val = nums[i]*nums[i];
            ans += val;
        }
        return ans;
    }
}