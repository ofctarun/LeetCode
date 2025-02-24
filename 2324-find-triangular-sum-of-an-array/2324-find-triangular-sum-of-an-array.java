class Solution {
    int recurse(int[] arr,int n){
        if(n==1)return arr[0];
        for(int i=0;i<n-1;i++) arr[i]=(arr[i]+arr[i+1])%10;
        return recurse(arr,n-1);
    }
    public int triangularSum(int[] nums) {
       return recurse(nums,nums.length); 
    }
}