class Solution {
    long atLeast(int[] nums, int bound){
        int i = 0, j = nums.length - 1;long ans = 0;
        while(i < j){
            if(nums[i] + nums[j] >= bound){
                ans += j - i;
                j--;
            }
            else i++;
        }
        return ans;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return atLeast(nums,lower) - atLeast(nums,upper + 1);
    }
}