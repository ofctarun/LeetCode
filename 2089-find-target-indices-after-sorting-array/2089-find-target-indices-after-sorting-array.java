class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int low = 0, tar = 0;
        for(int num : nums){
            if (num < target)low++;
            else if(num == target)tar++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < tar; i++){
            ans.add(low + i);
        }
        return ans;
    }
}