class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if (nums[i - 1] >= nums[i])return check(nums, i - 1) || check(nums, i);
        }
        return true;
    }
    private boolean check(int[] nums, int remove){
        int prev = -1;
        for(int i = 0; i < nums.length; i++){
            if (i == remove)continue;
            if (prev != -1 && nums[prev] >= nums[i])return false;
            prev = i;
        }
        return true;
    }
}