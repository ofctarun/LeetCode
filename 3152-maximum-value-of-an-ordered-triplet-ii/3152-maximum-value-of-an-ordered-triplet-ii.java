class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0,el = 0,diff = 0;
        for(int num : nums){
            ans = Math.max(ans,diff * num);
            diff = Math.max(diff,el - num);
            el = Math.max(el,num);
        }
        return ans;
    }
}