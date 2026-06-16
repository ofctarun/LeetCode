class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length,ans = nums[0] + nums[1] + nums[2];
        if(n == 3 || ans >= target) return ans;
        for(int i=0;i<n;i++){
            int j = i + 1, k = n - 1;
            while(j < k){
                int curr = nums[i] + nums[j] + nums[k];
                if(Math.abs(target - ans) > Math.abs(target - curr))ans = curr;
                if(curr < target)j++;
                else if(curr > target)k--;
                else return target;
            }
        }
        return ans;
    }
}