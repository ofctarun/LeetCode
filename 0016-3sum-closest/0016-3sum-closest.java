class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++){
            int j = i + 1, k = nums.length - 1;
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