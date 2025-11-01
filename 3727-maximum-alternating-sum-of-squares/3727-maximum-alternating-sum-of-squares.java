class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++)if(arr[i] < 0)arr[i] *= -1;
        Arrays.sort(arr);
        long ans = 0;
        int i = 0,j = n-1;
        while(i <= j){
            if(i == j) ans += (arr[i]*arr[i]);
            else{
                ans += (arr[j]*arr[j]);
                ans -= (arr[i]*arr[i]);
            }
            i++;
            j--;
        }
        return ans;
    }
}