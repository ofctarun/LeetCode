class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0,curr=0;
        for(int i=0;i<k;i++){
            curr+=nums[i];
        }
        ans=curr;
        for(int i=k;i<nums.length;i++){
            curr+=nums[i]-nums[i-k];
            if(curr>ans)ans=curr;
        }
        return ans/k;
    }
}