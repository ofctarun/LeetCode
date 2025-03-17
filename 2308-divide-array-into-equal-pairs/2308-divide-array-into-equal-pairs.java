class Solution {
    public boolean divideArray(int[] nums) {
        if((nums.length & 1) == 1)return false;
        int[] freq = new int[501];
        for(int num : nums)freq[num]++;
        for(int num : freq){
            if((num & 1) == 1)return false;
        }
        return true;
    }
}