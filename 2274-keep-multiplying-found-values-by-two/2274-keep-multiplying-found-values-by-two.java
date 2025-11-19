class Solution {
    public int findFinalValue(int[] nums, int OG) {
        Arrays.sort(nums);
        while(Arrays.binarySearch(nums, OG) >= 0){
            OG *= 2;
        }
        return OG;
    }
}
