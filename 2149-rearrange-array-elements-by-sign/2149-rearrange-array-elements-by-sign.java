class Solution {
    public int[] rearrangeArray(int[] nums) {
        int idx1 = 0, idx2 = 1;
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[idx1++] = nums[i];
                idx1++;
            }
            else{
                ans[idx2++] = nums[i];
                idx2++;
            }
        }
        return ans;
    }
}