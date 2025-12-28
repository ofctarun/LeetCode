class Solution {
    int firstNegativeIndex(int[] arr){
        int low = 0,high = arr.length - 1;
        int answer = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] < 0){
                answer = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return answer;
    }
    public int countNegatives(int[][] grid) {
        int c = 0;
        for(int[] arr : grid) if(firstNegativeIndex(arr) != -1) c += arr.length - firstNegativeIndex(arr);
        return c;
    }
}