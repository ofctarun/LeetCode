class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        int ans = 0, i = 0;
        for(int j = 0; j < nums.length; j++){
            while(!max.isEmpty() && nums[max.peekLast()] < nums[j])max.pollLast();
            max.offerLast(j);
            while(!min.isEmpty() && nums[min.peekLast()] > nums[j])min.pollLast();
            min.offerLast(j);
            while(nums[max.peekFirst()] - nums[min.peekFirst()] > limit){
                if(max.peekFirst() == i)max.pollFirst();
                if(min.peekFirst() == i)min.pollFirst();
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}