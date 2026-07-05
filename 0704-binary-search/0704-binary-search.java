class Solution {
    public int search(int[] nums, int target) {
        int ans = Arrays.binarySearch(nums, target);
        if(ans > -1 && ans < nums.length)return ans;
        return -1;
    }
}