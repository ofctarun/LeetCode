class Solution {
    public int findPeakElement(int[] nums) {
        int st=0,end = nums.length - 1,mid;
        while(st < end){
            mid = st + (end - st)/2;
            if(nums[mid] > nums[mid + 1])end = mid;
            else st = mid + 1;
        }
        return st;
        
    }
}