class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++)if(nums[i]==0)nums[i]=-1;
        int prefixSum = 0, ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if(prefixSum==0)ans=i+1;
            if(hm.containsKey(prefixSum))ans=Math.max(ans,i-hm.get(prefixSum));
            else hm.put(prefixSum,i);
        }
        return ans; 
    }
}