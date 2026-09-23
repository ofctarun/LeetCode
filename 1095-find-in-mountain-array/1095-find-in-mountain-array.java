/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int bs1(MountainArray mountainArr, int target, int peak){
        int low = 0, high = peak;
        while(low <= high){
            int mid = low + (high - low)/2;
            int curr = mountainArr.get(mid);
            if(curr == target)return mid;
            if(curr < target)low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    int bs2(MountainArray mountainArr, int target, int peak){
        int low = peak, high = mountainArr.length() - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int curr = mountainArr.get(mid);
            if(curr == target)return mid;
            if(curr > target)low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0, high = mountainArr.length() - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1))low= mid + 1;
            else high = mid - 1;
        }
        int res = bs1(mountainArr, target, low);
        if(res != -1)return res;
        return bs2(mountainArr, target, low + 1);
    }
}