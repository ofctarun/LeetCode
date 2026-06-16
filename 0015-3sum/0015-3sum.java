class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    void twoSum(int[] nums,int i){
        int j = nums.length - 1,target = -nums[i-1];
        while(i < j){
            if(nums[i] + nums[j] > target)j--;
            else if(nums[i] + nums[j] < target)i++;
            else{
                while(i < j && nums[i] == nums[i+1])i++;
                while(i < j && nums[j] == nums[j-1])j--;
                ans.add(List.of(-target,nums[i],nums[j]));
                i++;
                j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            twoSum(nums,i + 1);
        }
        return ans;   
    }
}