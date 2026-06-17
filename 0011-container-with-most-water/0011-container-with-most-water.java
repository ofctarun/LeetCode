class Solution {
    public int maxArea(int[] h) {
        if(h.length == 2)return Math.min(h[0],h[1]);
        int l = 0,r = h.length - 1,mx = 0;
        while(l < r){
            mx = Math.max(mx,Math.min(h[l],h[r]) * (r - l));
            if(h[l] > h[r])r--;
            else l++;
        }
        return mx;
    }
}
