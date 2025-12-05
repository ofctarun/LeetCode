class Solution {
    public int countPartitions(int[] nums) {
        int l = 0,r = 0,n=nums.length;
        for(int i=0;i<n;i++)r+=nums[i];
        int c = 0;
        for(int i=0;i<n-1;i++){
            l+=nums[i];
            r-=nums[i];
            if((l-r)%2==0)c++;
        }
        return c;
    }
}