class Solution {
    boolean diffArray(int[] nums,int[][] queries,int k){
        int n = nums.length;
        int[] diff = new int[n];
        for(int i=0;i<k;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int dec = queries[i][2];
            diff[l] += dec;
            if(r+1<n){
                diff[r+1] -= dec;
            }
        }
        int c = 0;
        for(int i=0;i<n;i++){
            c += diff[i];
            if(nums[i]>c)return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        if(Arrays.stream(nums).allMatch(num->num==0))return 0;
        int l=1,r=queries.length,ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(diffArray(nums,queries,mid)){
                ans = mid;
                r = mid-1;

            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}