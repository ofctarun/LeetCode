class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum = 0, ans = 0;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            set.add(nums[j]);
            sum += nums[j];
            if(j - i + 1 < k)j++;
            else{
                if(j - i + 1 == k)ans = Math.max(sum, ans);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}