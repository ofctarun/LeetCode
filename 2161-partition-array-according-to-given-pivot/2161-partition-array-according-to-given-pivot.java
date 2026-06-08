class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int idx = 0 ;
        for(int el : nums)if(el<pivot)result[idx++]=el;
        for(int el : nums)if(el==pivot)result[idx++]=el;
        for(int el : nums)if(el>pivot)result[idx++]=el;
        return result;
    }
}