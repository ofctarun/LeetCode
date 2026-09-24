class Solution {
    public int smallestIndex(int[] nums) {
        if(nums[0] == 0)return 0;
        if(nums.length > 1 && nums[1] == 1000) return 1;
        for(int i = 1; i < nums.length; i++){
            int dig = (int)Math.log10(nums[i]);
            if((dig == 0 && i == nums[i]) || (dig == 1 && ((nums[i]%10 + nums[i]/10) == i)) || (dig == 2 && ((nums[i]%10 + (nums[i]/10)%10 + nums[i]/100) == i)))return i;
        }
        return -1;
    }
}