class Solution {
    public int findMaxLength(int[] nums) {
        int prefixSum = 0, ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefixSum += (nums[i]==0)?-1:1;
            if(hm.containsKey(prefixSum))ans=Math.max(ans,i-hm.get(prefixSum));
            else hm.put(prefixSum,i);
        }
        return ans; 
    }
}