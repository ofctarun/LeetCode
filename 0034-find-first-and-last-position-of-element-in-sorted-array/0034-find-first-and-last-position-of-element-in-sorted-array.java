class Solution {
    int binarySearch(int nums[],int target,boolean left){
        int ans = -1;
        int st = 0,end = nums.length - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] < target){
                st = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(left)end = mid - 1;
                else st = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums,target,true) , binarySearch(nums,target,false)};
    }
}