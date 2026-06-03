class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE,avg = 0;
        int i = 0,j = 0;
        while(j < nums.length){
            avg += (double) nums[j] / k;
            if(j - i + 1 < k){
                j++;
            }
            else{
                ans = Math.max(ans,avg);
                avg -= (double) nums[i] / k;
                i++;
                j++;
            }
        }
        return ans;
    }
}