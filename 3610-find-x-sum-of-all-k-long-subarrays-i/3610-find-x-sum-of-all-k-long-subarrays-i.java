class Solution {
    int getAns(int[] nums, int st, int end,int x){
        int[] freq = new int[51];
        int unq = 0, total = 0;
        for(int i=st;i<=end;i++){
            total += nums[i];
            if(freq[nums[i]]==0)unq++;
            freq[nums[i]]++;
        }
        if(unq < x)return total;
        int res = 0;
        for(int i=0;i<x;i++){
            int num = -1,freqq = -1;
            for(int j=50;j>=1;j--){
                if(freq[j] > freqq){
                    freqq = freq[j];
                    num = j;
                }
            }
            if(num != -1){
                res += num * freqq;
                freq[num] = 0;
            }
        }
        return res;
    }
    public int[] findXSum(int[] nums, int k, int x) {
        int[] ans = new int[nums.length - k + 1];
        for(int i=0;i<ans.length;i++){
            ans[i] = getAns(nums, i, i + k - 1, x);
        }
        return ans;
    }
}