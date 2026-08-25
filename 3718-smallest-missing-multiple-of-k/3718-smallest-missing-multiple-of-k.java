class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int a = k;
        for(int i=0;i<n;i++){
            if(nums[i] == a){
                a = a + k;
                i = -1;
            }
        }
        return a;
    }
}