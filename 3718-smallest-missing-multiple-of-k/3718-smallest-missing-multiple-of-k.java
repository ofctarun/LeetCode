class Solution {
    public int missingMultiple(int[] nums, int k) {
        int id[] = new int[101];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                id[nums[i]/k]++;
            }
        }
        for(int i = 1;i < 100; i++){
            if(id[i] == 0)return i*k;
        }
        return 101*k;
    }
}