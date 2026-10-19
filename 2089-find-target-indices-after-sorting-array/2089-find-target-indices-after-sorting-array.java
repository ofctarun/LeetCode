class Solution {
    int getIndex(int[] nums, int target, boolean first){
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = high + (low - high) / 2;
            if(nums[mid] == target){
                ans = mid;
                if(first)high = mid - 1;
                else low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int low = getIndex(nums, target, true);
        if(low == -1)return Arrays.asList();
        int high = getIndex(nums, target, false);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = low; i <= high; i++)ans.add(i);
        return ans;
    }
}