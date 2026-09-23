class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums)sum += num;
        if(sum < x)return -1;
        if(sum == x)return nums.length;
        int req = sum - x;
        int max = -1, i = 0, curr = 0;
        for(int j=0;j<nums.length;j++){           
            curr += nums[j];
            while(i <= j && curr > req)curr -= nums[i++];
            if(curr == req)max = Math.max(max, j - i + 1);
        }
        return max == -1 ? -1 : nums.length-max;
    }
}