class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0,ans = 0,one = 0,zero = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 0)zero++; else one++;
            while(zero > k){
                if(nums[i] == 0)zero--; else one--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}