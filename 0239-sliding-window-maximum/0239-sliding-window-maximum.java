class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0,j = 0,n=nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        while(j<n){
            while(!dq.isEmpty() && dq.peekLast() < nums[j])dq.removeLast();
            dq.add(nums[j]);
            if(j - i + 1 < k){
                j++;
            }
            else{
                ans[i] = dq.peek();
                if(nums[i] == dq.peek())dq.removeFirst();
                i++;
                j++;
            }
        }
        return ans;
    }
}