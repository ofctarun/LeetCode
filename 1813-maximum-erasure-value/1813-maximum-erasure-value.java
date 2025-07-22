class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int st = 0,idx = 0,sum = 0,ans = 0;
        while(idx < nums.length){
            if(!hm.containsKey(nums[idx])){
                sum += nums[idx];
                hm.put(nums[idx],idx);
                idx++;
                ans = sum > ans ? sum : ans;
            }
            else{
                int dupIndex = hm.get(nums[idx]);
                while(st <= dupIndex){
                    sum -= nums[st];
                    hm.remove(nums[st]);
                    st++;
                }
            }
        }
        return ans;
    }
}