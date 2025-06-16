class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0,end = arr.length - 1,mid;
        while(st <= end){
            mid = st + (end - st)/2;
            if(arr[mid] > arr[mid + 1])end = mid - 1;
            else st = mid + 1;
        }
        return st;
    }
}