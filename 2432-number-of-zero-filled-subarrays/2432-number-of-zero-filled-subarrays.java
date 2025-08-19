class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans  = 0, curr = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 0)curr++;
            else if(nums[i] != 0 && curr != 0){
                ans += curr * (curr + 1) / 2;
                curr = 0;
            }
            i++;
        }
        if(curr != 0)ans += curr * (curr + 1) / 2;
        return ans;
    }
}