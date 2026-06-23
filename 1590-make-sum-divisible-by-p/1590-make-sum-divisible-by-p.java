class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for(int num : nums)sum += num;
        int req = (int)(sum % p);
        if(req == 0)return 0;
        sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int ans = nums.length;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int curr = (int)(sum % p);
            int target = (curr - req + p) % p;
            if(hm.containsKey(target))ans = Math.min(ans,i-hm.get(target));
            hm.put(curr , i);
        }
        return ans == nums.length ? -1 : ans;
    }
}