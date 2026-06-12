class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, ans = 1, sum = 0;
        for(int j = 1; j < nums.length; j++){
            sum += (long)(nums[j] - nums[j - 1])*(j - i);
            while(sum > k)sum -= nums[j] - nums[i++];
            ans  = ans > j - i + 1 ? ans : j - i + 1;
        }
        return ans == 30000 ? 29999 : ans;
    }
}