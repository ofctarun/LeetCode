class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n];
        int[] ans = new int[2];
        int k = 0;
        for(int i = 0;i<n;i++){
            if(arr[nums[i]]==true) ans[k++] = nums[i];
            else arr[nums[i]] = true;
        }
        return ans;
    }
}