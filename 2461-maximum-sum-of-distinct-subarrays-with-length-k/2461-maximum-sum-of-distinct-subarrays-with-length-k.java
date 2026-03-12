class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int dup = 0, i = 0, j = 0;
        long max = 0, ans = 0;
        while(j < nums.length){
            hm.put(nums[j], hm.getOrDefault(nums[j],0) + 1);
            if(hm.get(nums[j]) == 2)dup++;
            if(j - i + 1 < k){
                max += nums[j];
                j++;
            }
            else{
                max += nums[j];
                if(dup == 0)ans = ans > max ? ans : max;
                max -= nums[i];
                if(hm.get(nums[i]) == 1)hm.remove(nums[i]);
                else{
                    hm.put(nums[i], hm.get(nums[i]) - 1);
                    if(hm.get(nums[i]) == 1) dup--;
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}