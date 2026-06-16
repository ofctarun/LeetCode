class Solution {
    public int triangleNumber(int[] nums) {
       Arrays.sort(nums);
       int res = 0;
       for(int i = nums.length - 1; i >= 2 ; i--){
        int j = 0, k = i - 1;
        while(j < k){
            if(nums[j] + nums[k] > nums[i]){
                res += (k - j);
                k--;
            }
            else j++;
        }
       }
       return res;
    }
}