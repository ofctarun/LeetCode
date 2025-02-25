class Solution {
    public int maximumSum(int[] nums) {
        int[] mp = new int[82];
        Arrays.fill(mp,-1);
        int ans = -1;
        for(int num : nums){
            int sum=0,temp=num;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
            if(mp[sum] != -1){
                ans = Math.max(ans,num+mp[sum]);
            }
            mp[sum] = Math.max(num,mp[sum]);
        }
        return ans;
    }
}