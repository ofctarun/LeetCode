class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int idx = 0,i=0;
        while(i<n-1){
            if(nums[i]!=0){
                if(nums[i]==nums[i+1]){
                    nums[idx++]=nums[i]*2;
                    i++;
                }
                else nums[idx++]=nums[i];
            }
            i++;
        }
        if(i<=n-1 && nums[n-1]!=0)nums[idx++]=nums[n-1];
        while(idx<n){
            nums[idx++]=0;
        }
        return nums;
    }
}