class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, maxL = 0, maxR = 0, ans = 0;
        while(l < r){
            maxL = Math.max(height[l],maxL);
            maxR = Math.max(height[r],maxR);
            if(maxL < maxR) ans += maxL - height[l++];
            else ans += maxR - height[r--];
        }
        return ans;
    }
}