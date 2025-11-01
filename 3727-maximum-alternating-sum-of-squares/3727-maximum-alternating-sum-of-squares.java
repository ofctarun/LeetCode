class Solution {
    public long maxAlternatingSum(int[] arr) {
        for(int i =0; i< arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        int idx1=0, idx2=arr.length/2;
        long altScore = 0;
        while(idx1<arr.length/2){
            altScore += arr[idx2]-arr[idx1];
            idx2++;
            idx1++;
        }
        if(arr.length%2!=0){
            altScore +=arr[idx2];
        }
        return altScore;
    }
}