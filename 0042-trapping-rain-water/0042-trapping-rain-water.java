class Solution {
    public int trap(int[] height) {
        int n = height.length,ans = 0;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = height[0];
        for(int i = 1; i < n; i++){
            l[i] = Math.max(l[i - 1],height[i]);
        }
        r[n - 1] = height[n - 1];
        for(int j = n - 2; j >= 0; j--){
            r[j] = Math.max(r[j + 1],height[j]);
            ans += Math.min(l[j],r[j]) - height[j];
        }
        return ans;
    }
}