class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int l=0;
        long s=0,a=0;
        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                s=s-nums[l];
                l++;
            }
            set.add(nums[r]);
            s+=nums[r];
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