class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans = 0;
        for(int shift = -m + 1; shift < n; shift++){
            int len = 0;
            for(int i = 0; i < n; i++){
                int j = i - shift;
                if(j < 0 || j >= m) continue;
                if(nums1[i] == nums2[j]){
                    len++;
                    ans = Math.max(ans, len);
                }
                else len = 0;
            }
        }
        return ans;
    }
}