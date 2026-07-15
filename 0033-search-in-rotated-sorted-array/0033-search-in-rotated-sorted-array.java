class Solution {
    int bs(int[] arr, int low, int high, int target){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target)return mid;
            if(arr[mid] < target)low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length, low = 0, high = n - 1, min = 0;
        while(low <= high){
            if(nums[low] <= nums[high]){
                min = low;
                break;
            }
            int mid = low + (high - low)/2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
                min = mid;
                break;
            }
            if(nums[mid] <= nums[high])high = mid - 1;
            else low = mid + 1;
        }
        return Math.max(bs(nums,0,min-1,target), bs(nums,min,n-1,target));
    }
}