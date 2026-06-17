class Solution {
    public int maxArea(int[] h) {
        int l = 0,r = h.length - 1,mx = 0;
        while(l < r){
            mx = Math.max(mx,Math.min(h[l],h[r]) * (r - l));
            if(h[l] > h[r])r--;
            else l++;
        }
        return mx;
    }
}
