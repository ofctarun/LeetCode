class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0; i< nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int i=0, j=nums.length/2;
        long sum = 0;
        while(i<nums.length/2){
            sum += nums[j]-nums[i];
            j++;
            i++;
        }
        if(nums.length%2!=0){
            sum +=nums[j];
        }
        return sum;
    }
}