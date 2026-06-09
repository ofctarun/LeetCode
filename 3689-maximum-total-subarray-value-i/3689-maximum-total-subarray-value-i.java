class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = 0,min = Integer.MAX_VALUE;
        for(int i : nums){
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return (max - min)*k;
    }
}