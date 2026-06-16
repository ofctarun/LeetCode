class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1, idx = j;
        while(i <= j)res[idx--] = (-nums[i] > nums[j]) ? nums[i] * nums[i++] : nums[j] * nums[j--]; 
        return res;
    }
}