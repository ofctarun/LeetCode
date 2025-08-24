class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                left[i] = (i > 0 ? left[i-1] : 0) + 1;
            }
        }

        for (int i = n-1; i >= 0; i--) {
            if (nums[i] == 1) {
                right[i] = (i < n-1 ? right[i+1] : 0) + 1;
            }
        }

        int ans = 0;
        boolean hasZero = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                hasZero = true;
                int leftCnt = (i > 0 ? left[i-1] : 0);
                int rightCnt = (i < n-1 ? right[i+1] : 0);
                ans = Math.max(ans, leftCnt + rightCnt);
            }
        }
        if (!hasZero) return n-1;
        return ans;
    }
}
