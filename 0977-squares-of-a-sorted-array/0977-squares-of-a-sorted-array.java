class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1, idx = j;
        while(i <= j){
            if(-nums[i] >  nums[j]){
                res[idx--] = nums[i] * nums[i];
                i++;
            }
            else{
                res[idx--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}