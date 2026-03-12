class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int l=0;
        long s=0,a=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[l]);
                s=s-nums[l];
                l++;
            }
            set.add(nums[i]);
            s+=nums[i];
            if(set.size()>=k){
                a=Math.max(a,s);
                set.remove(nums[l]);
                s=s-nums[l];
                l++;
            }
        }
        return a;
        
    }
}